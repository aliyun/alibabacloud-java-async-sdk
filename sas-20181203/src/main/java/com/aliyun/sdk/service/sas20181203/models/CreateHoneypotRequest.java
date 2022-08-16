// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotRequest</p>
 */
public class CreateHoneypotRequest extends Request {
    @Query
    @NameInMap("HoneypotImageId")
    @Validation(required = true)
    private String honeypotImageId;

    @Query
    @NameInMap("HoneypotImageName")
    @Validation(required = true)
    private String honeypotImageName;

    @Query
    @NameInMap("HoneypotName")
    @Validation(required = true)
    private String honeypotName;

    @Query
    @NameInMap("Meta")
    private String meta;

    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    private CreateHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotImageId = builder.honeypotImageId;
        this.honeypotImageName = builder.honeypotImageName;
        this.honeypotName = builder.honeypotName;
        this.meta = builder.meta;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotImageId
     */
    public String getHoneypotImageId() {
        return this.honeypotImageId;
    }

    /**
     * @return honeypotImageName
     */
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    /**
     * @return honeypotName
     */
    public String getHoneypotName() {
        return this.honeypotName;
    }

    /**
     * @return meta
     */
    public String getMeta() {
        return this.meta;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<CreateHoneypotRequest, Builder> {
        private String honeypotImageId; 
        private String honeypotImageName; 
        private String honeypotName; 
        private String meta; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotRequest request) {
            super(request);
            this.honeypotImageId = request.honeypotImageId;
            this.honeypotImageName = request.honeypotImageName;
            this.honeypotName = request.honeypotName;
            this.meta = request.meta;
            this.nodeId = request.nodeId;
        } 

        /**
         * 蜜罐镜像ID
         */
        public Builder honeypotImageId(String honeypotImageId) {
            this.putQueryParameter("HoneypotImageId", honeypotImageId);
            this.honeypotImageId = honeypotImageId;
            return this;
        }

        /**
         * 蜜罐镜像名称
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * 蜜罐自定义名称
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * 蜜罐管理节点唯一id
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public CreateHoneypotRequest build() {
            return new CreateHoneypotRequest(this);
        } 

    } 

}

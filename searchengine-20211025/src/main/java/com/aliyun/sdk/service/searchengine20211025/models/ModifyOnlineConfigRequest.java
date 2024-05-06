// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOnlineConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyOnlineConfigRequest</p>
 */
public class ModifyOnlineConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, String > body;

    private ModifyOnlineConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeName = builder.nodeName;
        this.indexName = builder.indexName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOnlineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return body
     */
    public java.util.Map < String, String > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyOnlineConfigRequest, Builder> {
        private String instanceId; 
        private String nodeName; 
        private String indexName; 
        private java.util.Map < String, String > body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOnlineConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeName = request.nodeName;
            this.indexName = request.indexName;
            this.body = request.body;
        } 

        /**
         * The ID of the edge instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the document
         */
        public Builder nodeName(String nodeName) {
            this.putPathParameter("nodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The name of the index
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * ashortdescriptionofstruct
         */
        public Builder body(java.util.Map < String, String > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyOnlineConfigRequest build() {
            return new ModifyOnlineConfigRequest(this);
        } 

    } 

}

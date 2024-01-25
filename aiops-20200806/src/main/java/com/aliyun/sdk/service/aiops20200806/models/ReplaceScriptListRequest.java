// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceScriptListRequest} extends {@link RequestModel}
 *
 * <p>ReplaceScriptListRequest</p>
 */
public class ReplaceScriptListRequest extends Request {
    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("Type")
    private Integer type;

    private ReplaceScriptListRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.operaUid = builder.operaUid;
        this.sceneId = builder.sceneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceScriptListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ReplaceScriptListRequest, Builder> {
        private Integer id; 
        private String operaUid; 
        private String sceneId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceScriptListRequest request) {
            super(request);
            this.id = request.id;
            this.operaUid = request.operaUid;
            this.sceneId = request.sceneId;
            this.type = request.type;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ReplaceScriptListRequest build() {
            return new ReplaceScriptListRequest(this);
        } 

    } 

}

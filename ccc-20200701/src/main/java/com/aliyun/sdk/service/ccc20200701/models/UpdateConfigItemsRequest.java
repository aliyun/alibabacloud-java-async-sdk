// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateConfigItemsRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigItemsRequest</p>
 */
public class UpdateConfigItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    private UpdateConfigItemsRequest(Builder builder) {
        super(builder);
        this.configItems = builder.configItems;
        this.instanceId = builder.instanceId;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configItems
     */
    public String getConfigItems() {
        return this.configItems;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder extends Request.Builder<UpdateConfigItemsRequest, Builder> {
        private String configItems; 
        private String instanceId; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigItemsRequest request) {
            super(request);
            this.configItems = request.configItems;
            this.instanceId = request.instanceId;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;ShowCalledID&quot;,&quot;value&quot;:&quot;-1&quot;},{&quot;name&quot;:&quot;ShowCalleeID&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;AllowHangup&quot;,&quot;value&quot;:&quot;0&quot;},{&quot;name&quot;:&quot;AutoAnswerCall&quot;,&quot;value&quot;:&quot;-1&quot;},{&quot;name&quot;:&quot;AllowAudioDownload&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;AllowChooseSignedSkillGroup&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        public Builder configItems(String configItems) {
            this.putQueryParameter("ConfigItems", configItems);
            this.configItems = configItems;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        @Override
        public UpdateConfigItemsRequest build() {
            return new UpdateConfigItemsRequest(this);
        } 

    } 

}

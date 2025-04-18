// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateInstanceLabelsRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceLabelsRequest</p>
 */
public class UpdateInstanceLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Labels> labels;

    private UpdateInstanceLabelsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceLabelsRequest create() {
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceLabelsRequest, Builder> {
        private String instanceId; 
        private java.util.List<Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceLabelsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.labels = request.labels;
        } 

        /**
         * <p>The ID of the DSW instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The tags that you want to update.</p>
         * <p>This parameter is required.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public UpdateInstanceLabelsRequest build() {
            return new UpdateInstanceLabelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceLabelsRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceLabelsRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the custom tag.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>customLabelKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom tag.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>labelValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}

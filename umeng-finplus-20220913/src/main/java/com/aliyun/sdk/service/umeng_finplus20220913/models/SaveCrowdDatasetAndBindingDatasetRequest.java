// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link SaveCrowdDatasetAndBindingDatasetRequest} extends {@link RequestModel}
 *
 * <p>SaveCrowdDatasetAndBindingDatasetRequest</p>
 */
public class SaveCrowdDatasetAndBindingDatasetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SaveCrowdDatasetAndBindingDatasetRequestBody body;

    private SaveCrowdDatasetAndBindingDatasetRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCrowdDatasetAndBindingDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SaveCrowdDatasetAndBindingDatasetRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SaveCrowdDatasetAndBindingDatasetRequest, Builder> {
        private SaveCrowdDatasetAndBindingDatasetRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SaveCrowdDatasetAndBindingDatasetRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SaveCrowdDatasetAndBindingDatasetRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SaveCrowdDatasetAndBindingDatasetRequest build() {
            return new SaveCrowdDatasetAndBindingDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveCrowdDatasetAndBindingDatasetRequest} extends {@link TeaModel}
     *
     * <p>SaveCrowdDatasetAndBindingDatasetRequest</p>
     */
    public static class SaveCrowdDatasetAndBindingDatasetRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String appId;

        @com.aliyun.core.annotation.NameInMap("datasetIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> datasetIds;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String name;

        private SaveCrowdDatasetAndBindingDatasetRequestBody(Builder builder) {
            this.appId = builder.appId;
            this.datasetIds = builder.datasetIds;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaveCrowdDatasetAndBindingDatasetRequestBody create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return datasetIds
         */
        public java.util.List<String> getDatasetIds() {
            return this.datasetIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> datasetIds; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(SaveCrowdDatasetAndBindingDatasetRequestBody model) {
                this.appId = model.appId;
                this.datasetIds = model.datasetIds;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder datasetIds(java.util.List<String> datasetIds) {
                this.datasetIds = datasetIds;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SaveCrowdDatasetAndBindingDatasetRequestBody build() {
                return new SaveCrowdDatasetAndBindingDatasetRequestBody(this);
            } 

        } 

    }
}

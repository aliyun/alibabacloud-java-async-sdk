// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRecommendationDataRequest} extends {@link RequestModel}
 *
 * <p>UploadRecommendationDataRequest</p>
 */
public class UploadRecommendationDataRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Content")
    private java.util.List < Content> content;

    @Body
    @NameInMap("DataType")
    private String dataType;

    private UploadRecommendationDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.dataType = builder.dataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRecommendationDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    public static final class Builder extends Request.Builder<UploadRecommendationDataRequest, Builder> {
        private String regionId; 
        private java.util.List < Content> content; 
        private String dataType; 

        private Builder() {
            super();
        } 

        private Builder(UploadRecommendationDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.dataType = request.dataType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        @Override
        public UploadRecommendationDataRequest build() {
            return new UploadRecommendationDataRequest(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Fields")
        private String fields;

        @NameInMap("OperationType")
        private String operationType;

        private Content(Builder builder) {
            this.fields = builder.fields;
            this.operationType = builder.operationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public String getFields() {
            return this.fields;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        public static final class Builder {
            private String fields; 
            private String operationType; 

            /**
             * Fields.
             */
            public Builder fields(String fields) {
                this.fields = fields;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}

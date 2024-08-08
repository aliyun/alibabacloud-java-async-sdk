// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CalculateMemberLevelRequest} extends {@link RequestModel}
 *
 * <p>CalculateMemberLevelRequest</p>
 */
public class CalculateMemberLevelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private CalculateMemberLevelRequestBody body;

    private CalculateMemberLevelRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalculateMemberLevelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CalculateMemberLevelRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CalculateMemberLevelRequest, Builder> {
        private CalculateMemberLevelRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CalculateMemberLevelRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * Body.
         */
        public Builder body(CalculateMemberLevelRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putQueryParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CalculateMemberLevelRequest build() {
            return new CalculateMemberLevelRequest(this);
        } 

    } 

    public static class CalculateMemberLevelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentGrade")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer currentGrade;

        @com.aliyun.core.annotation.NameInMap("CurrentGradeName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String currentGradeName;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serialNo;

        private CalculateMemberLevelRequestBody(Builder builder) {
            this.currentGrade = builder.currentGrade;
            this.currentGradeName = builder.currentGradeName;
            this.memberId = builder.memberId;
            this.openMerchantId = builder.openMerchantId;
            this.platformType = builder.platformType;
            this.score = builder.score;
            this.serialNo = builder.serialNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalculateMemberLevelRequestBody create() {
            return builder().build();
        }

        /**
         * @return currentGrade
         */
        public Integer getCurrentGrade() {
            return this.currentGrade;
        }

        /**
         * @return currentGradeName
         */
        public String getCurrentGradeName() {
            return this.currentGradeName;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        public static final class Builder {
            private Integer currentGrade; 
            private String currentGradeName; 
            private String memberId; 
            private String openMerchantId; 
            private String platformType; 
            private String score; 
            private String serialNo; 

            /**
             * CurrentGrade.
             */
            public Builder currentGrade(Integer currentGrade) {
                this.currentGrade = currentGrade;
                return this;
            }

            /**
             * CurrentGradeName.
             */
            public Builder currentGradeName(String currentGradeName) {
                this.currentGradeName = currentGradeName;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            public CalculateMemberLevelRequestBody build() {
                return new CalculateMemberLevelRequestBody(this);
            } 

        } 

    }
}

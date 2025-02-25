// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumDeletableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumDeletableResponseBody</p>
 */
public class DescribeFabricConsortiumDeletableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricConsortiumDeletableResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumDeletableResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFabricConsortiumDeletableResponseBody build() {
            return new DescribeFabricConsortiumDeletableResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeName")
        private String codeName;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        @com.aliyun.core.annotation.NameInMap("ConsortiumName")
        private String consortiumName;

        @com.aliyun.core.annotation.NameInMap("Deletable")
        private Boolean deletable;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.codeName = builder.codeName;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.deletable = builder.deletable;
            this.description = builder.description;
            this.domain = builder.domain;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return codeName
         */
        public String getCodeName() {
            return this.codeName;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return consortiumName
         */
        public String getConsortiumName() {
            return this.consortiumName;
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String codeName; 
            private String consortiumId; 
            private String consortiumName; 
            private Boolean deletable; 
            private String description; 
            private String domain; 
            private String regionId; 
            private String state; 
            private String zoneId; 

            /**
             * CodeName.
             */
            public Builder codeName(String codeName) {
                this.codeName = codeName;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * ConsortiumName.
             */
            public Builder consortiumName(String consortiumName) {
                this.consortiumName = consortiumName;
                return this;
            }

            /**
             * Deletable.
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

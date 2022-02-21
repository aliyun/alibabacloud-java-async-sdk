// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationDeletableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationDeletableResponseBody</p>
 */
public class DescribeFabricOrganizationDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeFabricOrganizationDeletableResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricOrganizationDeletableResponseBody create() {
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

        public DescribeFabricOrganizationDeletableResponseBody build() {
            return new DescribeFabricOrganizationDeletableResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CodeName")
        private String codeName;

        @NameInMap("Deletable")
        private Boolean deletable;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("OrganizationDescription")
        private String organizationDescription;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("OrganizationName")
        private String organizationName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        @NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.codeName = builder.codeName;
            this.deletable = builder.deletable;
            this.domain = builder.domain;
            this.organizationDescription = builder.organizationDescription;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
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
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return organizationDescription
         */
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
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
            private Boolean deletable; 
            private String domain; 
            private String organizationDescription; 
            private String organizationId; 
            private String organizationName; 
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
             * Deletable.
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
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
             * OrganizationDescription.
             */
            public Builder organizationDescription(String organizationDescription) {
                this.organizationDescription = organizationDescription;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
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

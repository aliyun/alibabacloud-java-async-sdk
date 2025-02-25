// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficControlsResponseBody</p>
 */
public class DescribeTrafficControlsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TrafficControls")
    private TrafficControls trafficControls;

    private DescribeTrafficControlsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficControls = builder.trafficControls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficControlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficControls
     */
    public TrafficControls getTrafficControls() {
        return this.trafficControls;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private TrafficControls trafficControls; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrafficControls.
         */
        public Builder trafficControls(TrafficControls trafficControls) {
            this.trafficControls = trafficControls;
            return this;
        }

        public DescribeTrafficControlsResponseBody build() {
            return new DescribeTrafficControlsResponseBody(this);
        } 

    } 

    public static class Special extends TeaModel {
        @NameInMap("SpecialKey")
        private String specialKey;

        @NameInMap("TrafficValue")
        private Integer trafficValue;

        private Special(Builder builder) {
            this.specialKey = builder.specialKey;
            this.trafficValue = builder.trafficValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Special create() {
            return builder().build();
        }

        /**
         * @return specialKey
         */
        public String getSpecialKey() {
            return this.specialKey;
        }

        /**
         * @return trafficValue
         */
        public Integer getTrafficValue() {
            return this.trafficValue;
        }

        public static final class Builder {
            private String specialKey; 
            private Integer trafficValue; 

            /**
             * SpecialKey.
             */
            public Builder specialKey(String specialKey) {
                this.specialKey = specialKey;
                return this;
            }

            /**
             * TrafficValue.
             */
            public Builder trafficValue(Integer trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            public Special build() {
                return new Special(this);
            } 

        } 

    }
    public static class Specials extends TeaModel {
        @NameInMap("Special")
        private java.util.List < Special> special;

        private Specials(Builder builder) {
            this.special = builder.special;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specials create() {
            return builder().build();
        }

        /**
         * @return special
         */
        public java.util.List < Special> getSpecial() {
            return this.special;
        }

        public static final class Builder {
            private java.util.List < Special> special; 

            /**
             * Special.
             */
            public Builder special(java.util.List < Special> special) {
                this.special = special;
                return this;
            }

            public Specials build() {
                return new Specials(this);
            } 

        } 

    }
    public static class SpecialPolicy extends TeaModel {
        @NameInMap("SpecialType")
        private String specialType;

        @NameInMap("Specials")
        private Specials specials;

        private SpecialPolicy(Builder builder) {
            this.specialType = builder.specialType;
            this.specials = builder.specials;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecialPolicy create() {
            return builder().build();
        }

        /**
         * @return specialType
         */
        public String getSpecialType() {
            return this.specialType;
        }

        /**
         * @return specials
         */
        public Specials getSpecials() {
            return this.specials;
        }

        public static final class Builder {
            private String specialType; 
            private Specials specials; 

            /**
             * SpecialType.
             */
            public Builder specialType(String specialType) {
                this.specialType = specialType;
                return this;
            }

            /**
             * Specials.
             */
            public Builder specials(Specials specials) {
                this.specials = specials;
                return this;
            }

            public SpecialPolicy build() {
                return new SpecialPolicy(this);
            } 

        } 

    }
    public static class SpecialPolicies extends TeaModel {
        @NameInMap("SpecialPolicy")
        private java.util.List < SpecialPolicy> specialPolicy;

        private SpecialPolicies(Builder builder) {
            this.specialPolicy = builder.specialPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecialPolicies create() {
            return builder().build();
        }

        /**
         * @return specialPolicy
         */
        public java.util.List < SpecialPolicy> getSpecialPolicy() {
            return this.specialPolicy;
        }

        public static final class Builder {
            private java.util.List < SpecialPolicy> specialPolicy; 

            /**
             * SpecialPolicy.
             */
            public Builder specialPolicy(java.util.List < SpecialPolicy> specialPolicy) {
                this.specialPolicy = specialPolicy;
                return this;
            }

            public SpecialPolicies build() {
                return new SpecialPolicies(this);
            } 

        } 

    }
    public static class TrafficControl extends TeaModel {
        @NameInMap("ApiDefault")
        private Integer apiDefault;

        @NameInMap("AppDefault")
        private Integer appDefault;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("SpecialPolicies")
        private SpecialPolicies specialPolicies;

        @NameInMap("TrafficControlId")
        private String trafficControlId;

        @NameInMap("TrafficControlName")
        private String trafficControlName;

        @NameInMap("TrafficControlUnit")
        private String trafficControlUnit;

        @NameInMap("UserDefault")
        private Integer userDefault;

        private TrafficControl(Builder builder) {
            this.apiDefault = builder.apiDefault;
            this.appDefault = builder.appDefault;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.specialPolicies = builder.specialPolicies;
            this.trafficControlId = builder.trafficControlId;
            this.trafficControlName = builder.trafficControlName;
            this.trafficControlUnit = builder.trafficControlUnit;
            this.userDefault = builder.userDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControl create() {
            return builder().build();
        }

        /**
         * @return apiDefault
         */
        public Integer getApiDefault() {
            return this.apiDefault;
        }

        /**
         * @return appDefault
         */
        public Integer getAppDefault() {
            return this.appDefault;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return specialPolicies
         */
        public SpecialPolicies getSpecialPolicies() {
            return this.specialPolicies;
        }

        /**
         * @return trafficControlId
         */
        public String getTrafficControlId() {
            return this.trafficControlId;
        }

        /**
         * @return trafficControlName
         */
        public String getTrafficControlName() {
            return this.trafficControlName;
        }

        /**
         * @return trafficControlUnit
         */
        public String getTrafficControlUnit() {
            return this.trafficControlUnit;
        }

        /**
         * @return userDefault
         */
        public Integer getUserDefault() {
            return this.userDefault;
        }

        public static final class Builder {
            private Integer apiDefault; 
            private Integer appDefault; 
            private String createdTime; 
            private String description; 
            private String modifiedTime; 
            private SpecialPolicies specialPolicies; 
            private String trafficControlId; 
            private String trafficControlName; 
            private String trafficControlUnit; 
            private Integer userDefault; 

            /**
             * ApiDefault.
             */
            public Builder apiDefault(Integer apiDefault) {
                this.apiDefault = apiDefault;
                return this;
            }

            /**
             * AppDefault.
             */
            public Builder appDefault(Integer appDefault) {
                this.appDefault = appDefault;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * SpecialPolicies.
             */
            public Builder specialPolicies(SpecialPolicies specialPolicies) {
                this.specialPolicies = specialPolicies;
                return this;
            }

            /**
             * TrafficControlId.
             */
            public Builder trafficControlId(String trafficControlId) {
                this.trafficControlId = trafficControlId;
                return this;
            }

            /**
             * TrafficControlName.
             */
            public Builder trafficControlName(String trafficControlName) {
                this.trafficControlName = trafficControlName;
                return this;
            }

            /**
             * TrafficControlUnit.
             */
            public Builder trafficControlUnit(String trafficControlUnit) {
                this.trafficControlUnit = trafficControlUnit;
                return this;
            }

            /**
             * UserDefault.
             */
            public Builder userDefault(Integer userDefault) {
                this.userDefault = userDefault;
                return this;
            }

            public TrafficControl build() {
                return new TrafficControl(this);
            } 

        } 

    }
    public static class TrafficControls extends TeaModel {
        @NameInMap("TrafficControl")
        private java.util.List < TrafficControl> trafficControl;

        private TrafficControls(Builder builder) {
            this.trafficControl = builder.trafficControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControls create() {
            return builder().build();
        }

        /**
         * @return trafficControl
         */
        public java.util.List < TrafficControl> getTrafficControl() {
            return this.trafficControl;
        }

        public static final class Builder {
            private java.util.List < TrafficControl> trafficControl; 

            /**
             * TrafficControl.
             */
            public Builder trafficControl(java.util.List < TrafficControl> trafficControl) {
                this.trafficControl = trafficControl;
                return this;
            }

            public TrafficControls build() {
                return new TrafficControls(this);
            } 

        } 

    }
}

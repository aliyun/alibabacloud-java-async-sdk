// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficControlsResponseBody</p>
 */
public class DescribeTrafficControlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficControls")
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>93D91A99-F093-4596-87BA-3C4FBFD3FD8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The returned throttling policy information. It is an array consisting of TrafficControl data.</p>
         */
        public Builder trafficControls(TrafficControls trafficControls) {
            this.trafficControls = trafficControls;
            return this;
        }

        public DescribeTrafficControlsResponseBody build() {
            return new DescribeTrafficControlsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class Special extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecialKey")
        private String specialKey;

        @com.aliyun.core.annotation.NameInMap("TrafficValue")
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
             * <p>The AppId or user account corresponding to SpecialType.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test_wg@aliyun.com">test_wg@aliyun.com</a></p>
             */
            public Builder specialKey(String specialKey) {
                this.specialKey = specialKey;
                return this;
            }

            /**
             * <p>The throttling value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class Specials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Special")
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
    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class SpecialPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecialType")
        private String specialType;

        @com.aliyun.core.annotation.NameInMap("Specials")
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
             * <p>The type of the special throttling policy. Valid values:</p>
             * <ul>
             * <li><strong>APP</strong></li>
             * <li><strong>USER</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder specialType(String specialType) {
                this.specialType = specialType;
                return this;
            }

            /**
             * <p>The returned information about a special throttling policy. It is an array consisting of Special data.</p>
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
    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class SpecialPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecialPolicy")
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
    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class TrafficControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDefault")
        private Integer apiDefault;

        @com.aliyun.core.annotation.NameInMap("AppDefault")
        private Integer appDefault;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("SpecialPolicies")
        private SpecialPolicies specialPolicies;

        @com.aliyun.core.annotation.NameInMap("TrafficControlId")
        private String trafficControlId;

        @com.aliyun.core.annotation.NameInMap("TrafficControlName")
        private String trafficControlName;

        @com.aliyun.core.annotation.NameInMap("TrafficControlUnit")
        private String trafficControlUnit;

        @com.aliyun.core.annotation.NameInMap("UserDefault")
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
             * <p>The default throttling value for each API.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder apiDefault(Integer apiDefault) {
                this.apiDefault = apiDefault;
                return this;
            }

            /**
             * <p>The default throttling value for each app.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder appDefault(Integer appDefault) {
                this.appDefault = appDefault;
                return this;
            }

            /**
             * <p>The creation time (UTC) of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-01-27T10:19:39Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-01-27T10:34:38Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The returned information about a special throttling policy. It is an array consisting of SpecialPolicy data.</p>
             */
            public Builder specialPolicies(SpecialPolicies specialPolicies) {
                this.specialPolicies = specialPolicies;
                return this;
            }

            /**
             * <p>The ID of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cfed6c970d45481dbe136d6b5ac68c41</p>
             */
            public Builder trafficControlId(String trafficControlId) {
                this.trafficControlId = trafficControlId;
                return this;
            }

            /**
             * <p>The name of the throttling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>wulingtestq1</p>
             */
            public Builder trafficControlName(String trafficControlName) {
                this.trafficControlName = trafficControlName;
                return this;
            }

            /**
             * <p>The unit to be used in the throttling policy. Valid values:</p>
             * <ul>
             * <li>MINUTE</li>
             * <li>HOUR</li>
             * <li>DAY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Minute</p>
             */
            public Builder trafficControlUnit(String trafficControlUnit) {
                this.trafficControlUnit = trafficControlUnit;
                return this;
            }

            /**
             * <p>The default throttling value for each user.</p>
             * 
             * <strong>example:</strong>
             * <p>15000</p>
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
    /**
     * 
     * {@link DescribeTrafficControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficControlsResponseBody</p>
     */
    public static class TrafficControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficControl")
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyTagPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyTagPoliciesResponseBody</p>
 */
public class ApplyTagPoliciesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ApplyTagPoliciesResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTagPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyTagPoliciesResponseBody build() {
            return new ApplyTagPoliciesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CarryData")
        private Boolean carryData;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceNum")
        private Integer instanceNum;

        @NameInMap("Name")
        private String name;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("Remove")
        private Boolean remove;

        @NameInMap("Rules")
        private String rules;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.carryData = builder.carryData;
            this.enable = builder.enable;
            this.id = builder.id;
            this.instanceNum = builder.instanceNum;
            this.name = builder.name;
            this.rate = builder.rate;
            this.remove = builder.remove;
            this.rules = builder.rules;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carryData
         */
        public Boolean getCarryData() {
            return this.carryData;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return remove
         */
        public Boolean getRemove() {
            return this.remove;
        }

        /**
         * @return rules
         */
        public String getRules() {
            return this.rules;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Boolean carryData; 
            private Boolean enable; 
            private Long id; 
            private Integer instanceNum; 
            private String name; 
            private Integer rate; 
            private Boolean remove; 
            private String rules; 
            private Integer status; 
            private String tag; 

            /**
             * Indicates whether the field is the primary key.
             */
            public Builder carryData(Boolean carryData) {
                this.carryData = carryData;
                return this;
            }

            /**
             * Indicates whether the routing rule is enabled.
             * <p>
             * 
             * *   `true`: enabled
             * *   `false`: disabled
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The ID of the primary key.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * The policy name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Indicates whether the routing rule is deleted.
             */
            public Builder remove(Boolean remove) {
                this.remove = remove;
                return this;
            }

            /**
             * The details of the routing rule.
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

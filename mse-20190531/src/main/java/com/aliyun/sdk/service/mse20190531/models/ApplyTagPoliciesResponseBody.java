// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ApplyTagPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyTagPoliciesResponseBody</p>
 */
public class ApplyTagPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ApplyTagPoliciesResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyTagPoliciesResponseBody build() {
            return new ApplyTagPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyTagPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyTagPoliciesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CarryData")
        private Boolean carryData;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private Boolean remove;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private String rules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.carryData = model.carryData;
                this.enable = model.enable;
                this.id = model.id;
                this.instanceNum = model.instanceNum;
                this.name = model.name;
                this.rate = model.rate;
                this.remove = model.remove;
                this.rules = model.rules;
                this.status = model.status;
                this.tag = model.tag;
            } 

            /**
             * <p>Indicates whether the field is the primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder carryData(Boolean carryData) {
                this.carryData = carryData;
                return this;
            }

            /**
             * <p>Indicates whether the rule is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The rule is enabled.</li>
             * <li><code>false</code>: The rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The rate.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>Indicates whether the routing rule was deleted.</p>
             */
            public Builder remove(Boolean remove) {
                this.remove = remove;
                return this;
            }

            /**
             * <p>The details of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_base&quot;: {&quot;rate&quot;: 100, &quot;remove&quot;: true}, &quot;blue&quot;: {&quot;rate&quot;: 0}}</p>
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>gray</p>
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

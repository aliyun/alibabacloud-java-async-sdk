// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCrowdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrowdsResponseBody</p>
 */
public class ListCrowdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Crowds")
    private java.util.List < Crowds> crowds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCrowdsResponseBody(Builder builder) {
        this.crowds = builder.crowds;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrowdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return crowds
     */
    public java.util.List < Crowds> getCrowds() {
        return this.crowds;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Crowds> crowds; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Crowds.
         */
        public Builder crowds(java.util.List < Crowds> crowds) {
            this.crowds = crowds;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCrowdsResponseBody build() {
            return new ListCrowdsResponseBody(this);
        } 

    } 

    public static class Crowds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrowdId")
        private String crowdId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Users")
        private String users;

        private Crowds(Builder builder) {
            this.crowdId = builder.crowdId;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.label = builder.label;
            this.name = builder.name;
            this.quantity = builder.quantity;
            this.source = builder.source;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Crowds create() {
            return builder().build();
        }

        /**
         * @return crowdId
         */
        public String getCrowdId() {
            return this.crowdId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return users
         */
        public String getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String crowdId; 
            private String description; 
            private String gmtCreateTime; 
            private String label; 
            private String name; 
            private String quantity; 
            private String source; 
            private String users; 

            /**
             * CrowdId.
             */
            public Builder crowdId(String crowdId) {
                this.crowdId = crowdId;
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
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(String users) {
                this.users = users;
                return this;
            }

            public Crowds build() {
                return new Crowds(this);
            } 

        } 

    }
}

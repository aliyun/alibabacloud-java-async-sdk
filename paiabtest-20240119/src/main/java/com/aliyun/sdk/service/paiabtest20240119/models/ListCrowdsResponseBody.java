// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

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
         * RequestId.
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
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("CrowdId")
        private String crowdId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("Users")
        private String users;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Crowds(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.crowdId = builder.crowdId;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.label = builder.label;
            this.name = builder.name;
            this.quantity = builder.quantity;
            this.users = builder.users;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Crowds create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
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
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
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
         * @return users
         */
        public String getUsers() {
            return this.users;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String aliyunId; 
            private String crowdId; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifyTime; 
            private String label; 
            private String name; 
            private String quantity; 
            private String users; 
            private String workspaceId; 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

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
             * GmtModifyTime.
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
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
             * Users.
             */
            public Builder users(String users) {
                this.users = users;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Crowds build() {
                return new Crowds(this);
            } 

        } 

    }
}

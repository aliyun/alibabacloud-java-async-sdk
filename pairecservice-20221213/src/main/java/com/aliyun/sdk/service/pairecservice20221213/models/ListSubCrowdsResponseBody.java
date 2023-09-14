// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubCrowdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubCrowdsResponseBody</p>
 */
public class ListSubCrowdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCrowds")
    private java.util.List < SubCrowds> subCrowds;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListSubCrowdsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subCrowds = builder.subCrowds;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubCrowdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCrowds
     */
    public java.util.List < SubCrowds> getSubCrowds() {
        return this.subCrowds;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SubCrowds> subCrowds; 
        private Long totalCount; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCrowds.
         */
        public Builder subCrowds(java.util.List < SubCrowds> subCrowds) {
            this.subCrowds = subCrowds;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSubCrowdsResponseBody build() {
            return new ListSubCrowdsResponseBody(this);
        } 

    } 

    public static class SubCrowds extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("Source")
        private String source;

        @NameInMap("SubCrowdId")
        private String subCrowdId;

        @NameInMap("Users")
        private String users;

        private SubCrowds(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.quantity = builder.quantity;
            this.source = builder.source;
            this.subCrowdId = builder.subCrowdId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCrowds create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return subCrowdId
         */
        public String getSubCrowdId() {
            return this.subCrowdId;
        }

        /**
         * @return users
         */
        public String getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private Integer quantity; 
            private String source; 
            private String subCrowdId; 
            private String users; 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
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
             * SubCrowdId.
             */
            public Builder subCrowdId(String subCrowdId) {
                this.subCrowdId = subCrowdId;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(String users) {
                this.users = users;
                return this;
            }

            public SubCrowds build() {
                return new SubCrowds(this);
            } 

        } 

    }
}

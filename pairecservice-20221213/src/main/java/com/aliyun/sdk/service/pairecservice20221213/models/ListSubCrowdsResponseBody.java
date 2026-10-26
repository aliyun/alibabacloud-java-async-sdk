// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListSubCrowdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubCrowdsResponseBody</p>
 */
public class ListSubCrowdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCrowds")
    private java.util.List<SubCrowds> subCrowds;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SubCrowds> getSubCrowds() {
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
        private java.util.List<SubCrowds> subCrowds; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSubCrowdsResponseBody model) {
            this.requestId = model.requestId;
            this.subCrowds = model.subCrowds;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C5AEB79E-FAA4-5DCE-8CD7-1CAF549ECC3E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of sub-crowds.</p>
         */
        public Builder subCrowds(java.util.List<SubCrowds> subCrowds) {
            this.subCrowds = subCrowds;
            return this;
        }

        /**
         * <p>The total number of elements in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSubCrowdsResponseBody build() {
            return new ListSubCrowdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubCrowdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubCrowdsResponseBody</p>
     */
    public static class SubCrowds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SubCrowdId")
        private String subCrowdId;

        @com.aliyun.core.annotation.NameInMap("Users")
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

            private Builder() {
            } 

            private Builder(SubCrowds model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.quantity = model.quantity;
                this.source = model.source;
                this.subCrowdId = model.subCrowdId;
                this.users = model.users;
            } 

            /**
             * <p>The creation time. The value is in ISO 8601 format and includes a time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The number of users in the crowd group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The crowd source. Valid values:
             * ● ManualInput: Manual data entry.
             * ● UploadFile: File upload.</p>
             * 
             * <strong>example:</strong>
             * <p>ManualInput</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The sub-crowd ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder subCrowdId(String subCrowdId) {
                this.subCrowdId = subCrowdId;
                return this;
            }

            /**
             * <p>The users in the crowd group.</p>
             * 
             * <strong>example:</strong>
             * <p>user1,user2</p>
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

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
 * {@link ListRecallManagementServiceVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementServiceVersionsResponseBody</p>
 */
public class ListRecallManagementServiceVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersions")
    private java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRecallManagementServiceVersionsResponseBody(Builder builder) {
        this.recallManagementServiceVersions = builder.recallManagementServiceVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementServiceVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceVersions
     */
    public java.util.List<RecallManagementServiceVersions> getRecallManagementServiceVersions() {
        return this.recallManagementServiceVersions;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementServiceVersionsResponseBody model) {
            this.recallManagementServiceVersions = model.recallManagementServiceVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * RecallManagementServiceVersions.
         */
        public Builder recallManagementServiceVersions(java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions) {
            this.recallManagementServiceVersions = recallManagementServiceVersions;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecallManagementServiceVersionsResponseBody build() {
            return new ListRecallManagementServiceVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementServiceVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementServiceVersionsResponseBody</p>
     */
    public static class RecallManagementServiceVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
        private String recallManagementServiceVersionId;

        private RecallManagementServiceVersions(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementServiceVersions create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recallManagementServiceVersionId
         */
        public String getRecallManagementServiceVersionId() {
            return this.recallManagementServiceVersionId;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String isDefault; 
            private String name; 
            private String recallManagementServiceVersionId; 

            private Builder() {
            } 

            private Builder(RecallManagementServiceVersions model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.recallManagementServiceVersionId = model.recallManagementServiceVersionId;
            } 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
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
             * RecallManagementServiceVersionId.
             */
            public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
                this.recallManagementServiceVersionId = recallManagementServiceVersionId;
                return this;
            }

            public RecallManagementServiceVersions build() {
                return new RecallManagementServiceVersions(this);
            } 

        } 

    }
}

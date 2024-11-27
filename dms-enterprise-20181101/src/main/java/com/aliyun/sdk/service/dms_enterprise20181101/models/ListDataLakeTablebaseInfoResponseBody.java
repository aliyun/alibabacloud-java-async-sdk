// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataLakeTablebaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataLakeTablebaseInfoResponseBody</p>
 */
public class ListDataLakeTablebaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TablebaseInfoList")
    private TablebaseInfoList tablebaseInfoList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListDataLakeTablebaseInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tablebaseInfoList = builder.tablebaseInfoList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLakeTablebaseInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return tablebaseInfoList
     */
    public TablebaseInfoList getTablebaseInfoList() {
        return this.tablebaseInfoList;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TablebaseInfoList tablebaseInfoList; 
        private String totalCount; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TablebaseInfoList.
         */
        public Builder tablebaseInfoList(TablebaseInfoList tablebaseInfoList) {
            this.tablebaseInfoList = tablebaseInfoList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataLakeTablebaseInfoResponseBody build() {
            return new ListDataLakeTablebaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataLakeTablebaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataLakeTablebaseInfoResponseBody</p>
     */
    public static class TablebaseInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TablebaseInfo")
        private java.util.List < DLTablebaseInfo > tablebaseInfo;

        private TablebaseInfoList(Builder builder) {
            this.tablebaseInfo = builder.tablebaseInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablebaseInfoList create() {
            return builder().build();
        }

        /**
         * @return tablebaseInfo
         */
        public java.util.List < DLTablebaseInfo > getTablebaseInfo() {
            return this.tablebaseInfo;
        }

        public static final class Builder {
            private java.util.List < DLTablebaseInfo > tablebaseInfo; 

            /**
             * TablebaseInfo.
             */
            public Builder tablebaseInfo(java.util.List < DLTablebaseInfo > tablebaseInfo) {
                this.tablebaseInfo = tablebaseInfo;
                return this;
            }

            public TablebaseInfoList build() {
                return new TablebaseInfoList(this);
            } 

        } 

    }
}

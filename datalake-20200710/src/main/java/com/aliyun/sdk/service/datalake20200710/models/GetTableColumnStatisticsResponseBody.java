// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableColumnStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableColumnStatisticsResponseBody</p>
 */
public class GetTableColumnStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ColumnStatisticsObjList")
    private java.util.List < ColumnStatisticsObj > columnStatisticsObjList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetTableColumnStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.columnStatisticsObjList = builder.columnStatisticsObjList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableColumnStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return columnStatisticsObjList
     */
    public java.util.List < ColumnStatisticsObj > getColumnStatisticsObjList() {
        return this.columnStatisticsObjList;
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
        private String code; 
        private java.util.List < ColumnStatisticsObj > columnStatisticsObjList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ColumnStatisticsObjList
         */
        public Builder columnStatisticsObjList(java.util.List < ColumnStatisticsObj > columnStatisticsObjList) {
            this.columnStatisticsObjList = columnStatisticsObjList;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableColumnStatisticsResponseBody build() {
            return new GetTableColumnStatisticsResponseBody(this);
        } 

    } 

}

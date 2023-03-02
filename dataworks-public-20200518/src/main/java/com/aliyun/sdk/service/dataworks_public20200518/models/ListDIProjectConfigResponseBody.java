// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIProjectConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIProjectConfigResponseBody</p>
 */
public class ListDIProjectConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDIProjectConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIProjectConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the query operation.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDIProjectConfigResponseBody build() {
            return new ListDIProjectConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Config")
        private String config;

        private Data(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        public static final class Builder {
            private String config; 

            /**
             * The default global configuration of sync solutions. The value indicates the processing rules of different types of DDL messages. Example:
             * <p>
             * 
             * {"RENAMECOLUMN":"WARNING","DROPTABLE":"WARNING","CREATETABLE":"WARNING","MODIFYCOLUMN":"WARNING","TRUNCATETABLE":"WARNING","DROPCOLUMN":"WARNING","ADDCOLUMN":"WARNING","RENAMETABLE":"WARNING"}
             * 
             * Field description:
             * 
             * *   RENAMECOLUMN: renames the column.
             * *   DROPTABLE: deletes the table.
             * *   CREATETABLE: creates a table.
             * *   MODIFYCOLUMN: changes the column data type.
             * *   TRUNCATETABLE: clears the table.
             * *   DROPCOLUMN: deletes the column.
             * *   ADDCOLUMN: creates a column.
             * *   RENAMETABLE: renames the table.
             * 
             * DataWorks processes a DDL message of a specific type based on the following policies after it receives the message:
             * 
             * *   WARNING: ignores the message and records an alert in real-time sync logs. The alert contains information about the situation that the message is ignored because of an execution error.
             * *   IGNORE: discards the message and does not send it to the destination data source.
             * *   CRITICAL: terminates the real-time sync node and sets the node status to Failed.
             * *   NORMAL: sends the message to the destination data source to process the message. Each destination data source may process DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

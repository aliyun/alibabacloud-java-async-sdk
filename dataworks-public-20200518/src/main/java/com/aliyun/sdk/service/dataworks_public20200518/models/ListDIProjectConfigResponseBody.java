// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIProjectConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIProjectConfigResponseBody</p>
 */
public class ListDIProjectConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The information about the query.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
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
        @com.aliyun.core.annotation.NameInMap("Config")
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
             * The default global configuration of synchronization solutions. The value indicates the processing rules of different types of DDL messages. Example: {"RENAMECOLUMN":"WARNING","DROPTABLE":"WARNING","CREATETABLE":"WARNING","MODIFYCOLUMN":"WARNING","TRUNCATETABLE":"WARNING","DROPCOLUMN":"WARNING","ADDCOLUMN":"WARNING","RENAMETABLE":"WARNING"}
             * <p>
             * 
             * Field description:
             * 
             * *   RENAMECOLUMN: renames a column.
             * *   DROPTABLE: deletes a table.
             * *   CREATETABLE: creates a table.
             * *   MODIFYCOLUMN: changes the data type of a column.
             * *   TRUNCATETABLE: clears a table.
             * *   DROPCOLUMN: deletes a column.
             * *   ADDCOLUMN: creates a column.
             * *   RENAMETABLE: renames a table.
             * 
             * DataWorks processes a DDL message of a specific type based on the following rules:
             * 
             * *   WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.
             * *   IGNORE: discards the message and does not send it to the destination.
             * *   CRITICAL: terminates the real-time synchronization node and sets the node status to Failed.
             * *   NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.
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

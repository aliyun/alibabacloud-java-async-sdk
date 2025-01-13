// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The information about the query.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDIProjectConfigResponseBody build() {
            return new ListDIProjectConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIProjectConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIProjectConfigResponseBody</p>
     */
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
             * <p>The default global configuration of synchronization solutions. The value indicates the processing rules of different types of DDL messages. Example: {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
             * <p>Field description:</p>
             * <ul>
             * <li>RENAMECOLUMN: renames a column.</li>
             * <li>DROPTABLE: deletes a table.</li>
             * <li>CREATETABLE: creates a table.</li>
             * <li>MODIFYCOLUMN: changes the data type of a column.</li>
             * <li>TRUNCATETABLE: clears a table.</li>
             * <li>DROPCOLUMN: deletes a column.</li>
             * <li>ADDCOLUMN: creates a column.</li>
             * <li>RENAMETABLE: renames a table.</li>
             * </ul>
             * <p>DataWorks processes a DDL message of a specific type based on the following rules:</p>
             * <ul>
             * <li>WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.</li>
             * <li>IGNORE: discards the message and does not send it to the destination.</li>
             * <li>CRITICAL: terminates the real-time synchronization node and sets the node status to Failed.</li>
             * <li>NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
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

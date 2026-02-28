// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryThingModelExtendConfigPublishedResponseBody} extends {@link TeaModel}
 *
 * <p>QueryThingModelExtendConfigPublishedResponseBody</p>
 */
public class QueryThingModelExtendConfigPublishedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryThingModelExtendConfigPublishedResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryThingModelExtendConfigPublishedResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryThingModelExtendConfigPublishedResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryThingModelExtendConfigPublishedResponseBody build() {
            return new QueryThingModelExtendConfigPublishedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryThingModelExtendConfigPublishedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryThingModelExtendConfigPublishedResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        public static final class Builder {
            private String configuration; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
            } 

            /**
             * <p>The information about the extended TSL parameters. For more information about the definition of extended parameters, see <a href="https://help.aliyun.com/document_detail/150323.html">CreateThingModel</a>.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;profile&quot;:{&quot;productKey&quot;:&quot;a114x******&quot;},&quot;properties&quot;:[{&quot;originalDataType&quot;:{&quot;specs&quot;:{&quot;registerCount&quot;:1,&quot;reverseRegister&quot;:0,&quot;swap16&quot;:0},&quot;type&quot;:&quot;bool&quot;},&quot;identifier&quot;:&quot;WakeUpData&quot;,&quot;registerAddress&quot;:&quot;0x04&quot;,&quot;scaling&quot;:1,&quot;writeFunctionCode&quot;:0,&quot;operateType&quot;:&quot;inputStatus&quot;,&quot;pollingTime&quot;:1000,&quot;trigger&quot;:1}]}</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

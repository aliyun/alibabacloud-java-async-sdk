// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetServiceRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceRecordResponseBody</p>
 */
public class GetServiceRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("record")
    private Record record;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetServiceRecordResponseBody(Builder builder) {
        this.record = builder.record;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return record
     */
    public Record getRecord() {
        return this.record;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Record record; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetServiceRecordResponseBody model) {
            this.record = model.record;
            this.requestId = model.requestId;
        } 

        /**
         * record.
         */
        public Builder record(Record record) {
            this.record = record;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceRecordResponseBody build() {
            return new GetServiceRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceRecordResponseBody</p>
     */
    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("recordContent")
        private String recordContent;

        @com.aliyun.core.annotation.NameInMap("recordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Record(Builder builder) {
            this.recordContent = builder.recordContent;
            this.recordType = builder.recordType;
            this.serviceId = builder.serviceId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return recordContent
         */
        public String getRecordContent() {
            return this.recordContent;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String recordContent; 
            private String recordType; 
            private String serviceId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Record model) {
                this.recordContent = model.recordContent;
                this.recordType = model.recordType;
                this.serviceId = model.serviceId;
                this.workspace = model.workspace;
            } 

            /**
             * recordContent.
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * recordType.
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
}

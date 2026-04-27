// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddUnknownThreatDetectProcessRequest} extends {@link RequestModel}
 *
 * <p>AddUnknownThreatDetectProcessRequest</p>
 */
public class AddUnknownThreatDetectProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<Long> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessList")
    private java.util.List<ProcessList> processList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private AddUnknownThreatDetectProcessRequest(Builder builder) {
        super(builder);
        this.eventIdList = builder.eventIdList;
        this.processList = builder.processList;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUnknownThreatDetectProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventIdList
     */
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
    }

    /**
     * @return processList
     */
    public java.util.List<ProcessList> getProcessList() {
        return this.processList;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<AddUnknownThreatDetectProcessRequest, Builder> {
        private java.util.List<Long> eventIdList; 
        private java.util.List<ProcessList> processList; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(AddUnknownThreatDetectProcessRequest request) {
            super(request);
            this.eventIdList = request.eventIdList;
            this.processList = request.processList;
            this.uuidList = request.uuidList;
        } 

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<Long> eventIdList) {
            this.putQueryParameter("EventIdList", eventIdList);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * ProcessList.
         */
        public Builder processList(java.util.List<ProcessList> processList) {
            this.putQueryParameter("ProcessList", processList);
            this.processList = processList;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public AddUnknownThreatDetectProcessRequest build() {
            return new AddUnknownThreatDetectProcessRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddUnknownThreatDetectProcessRequest} extends {@link TeaModel}
     *
     * <p>AddUnknownThreatDetectProcessRequest</p>
     */
    public static class ProcessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        private ProcessList(Builder builder) {
            this.md5 = builder.md5;
            this.processPath = builder.processPath;
            this.remark = builder.remark;
            this.sha256 = builder.sha256;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessList create() {
            return builder().build();
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        public static final class Builder {
            private String md5; 
            private String processPath; 
            private String remark; 
            private String sha256; 

            private Builder() {
            } 

            private Builder(ProcessList model) {
                this.md5 = model.md5;
                this.processPath = model.processPath;
                this.remark = model.remark;
                this.sha256 = model.sha256;
            } 

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * ProcessPath.
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Sha256.
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            public ProcessList build() {
                return new ProcessList(this);
            } 

        } 

    }
}

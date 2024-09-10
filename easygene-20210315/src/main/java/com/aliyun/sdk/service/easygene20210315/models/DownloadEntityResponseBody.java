// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadEntityResponseBody</p>
 */
public class DownloadEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityCSVFile")
    private String entityCSVFile;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DownloadEntityResponseBody(Builder builder) {
        this.entityCSVFile = builder.entityCSVFile;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityCSVFile
     */
    public String getEntityCSVFile() {
        return this.entityCSVFile;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String entityCSVFile; 
        private String hostId; 
        private String requestId; 

        /**
         * EntityCSVFile.
         */
        public Builder entityCSVFile(String entityCSVFile) {
            this.entityCSVFile = entityCSVFile;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadEntityResponseBody build() {
            return new DownloadEntityResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOsVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetOsVersionResponseBody</p>
 */
public class GetOsVersionResponseBody extends TeaModel {
    @NameInMap("OsVersion")
    private java.util.List < OsVersion> osVersion;

    @NameInMap("RequestId")
    private String requestId;

    private GetOsVersionResponseBody(Builder builder) {
        this.osVersion = builder.osVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOsVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return osVersion
     */
    public java.util.List < OsVersion> getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OsVersion> osVersion; 
        private String requestId; 

        /**
         * OsVersion.
         */
        public Builder osVersion(java.util.List < OsVersion> osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOsVersionResponseBody build() {
            return new GetOsVersionResponseBody(this);
        } 

    } 

    public static class OsVersion extends TeaModel {
        @NameInMap("DownloadPath")
        private String downloadPath;

        private OsVersion(Builder builder) {
            this.downloadPath = builder.downloadPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsVersion create() {
            return builder().build();
        }

        /**
         * @return downloadPath
         */
        public String getDownloadPath() {
            return this.downloadPath;
        }

        public static final class Builder {
            private String downloadPath; 

            /**
             * 系统版本
             */
            public Builder downloadPath(String downloadPath) {
                this.downloadPath = downloadPath;
                return this;
            }

            public OsVersion build() {
                return new OsVersion(this);
            } 

        } 

    }
}

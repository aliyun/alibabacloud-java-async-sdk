// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOsDownloadPathResponseBody} extends {@link TeaModel}
 *
 * <p>GetOsDownloadPathResponseBody</p>
 */
public class GetOsDownloadPathResponseBody extends TeaModel {
    @NameInMap("OsVersion")
    private OsVersion osVersion;

    @NameInMap("RequestId")
    private String requestId;

    private GetOsDownloadPathResponseBody(Builder builder) {
        this.osVersion = builder.osVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOsDownloadPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return osVersion
     */
    public OsVersion getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OsVersion osVersion; 
        private String requestId; 

        /**
         * OsVersion.
         */
        public Builder osVersion(OsVersion osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOsDownloadPathResponseBody build() {
            return new GetOsDownloadPathResponseBody(this);
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
             * DownloadPath.
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

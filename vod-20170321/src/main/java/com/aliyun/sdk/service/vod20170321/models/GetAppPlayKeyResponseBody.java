// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAppPlayKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppPlayKeyResponseBody</p>
 */
public class GetAppPlayKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppPlayKey")
    private AppPlayKey appPlayKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppPlayKeyResponseBody(Builder builder) {
        this.appPlayKey = builder.appPlayKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppPlayKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appPlayKey
     */
    public AppPlayKey getAppPlayKey() {
        return this.appPlayKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppPlayKey appPlayKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAppPlayKeyResponseBody model) {
            this.appPlayKey = model.appPlayKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application playback key information.</p>
         */
        public Builder appPlayKey(AppPlayKey appPlayKey) {
            this.appPlayKey = appPlayKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppPlayKeyResponseBody build() {
            return new GetAppPlayKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppPlayKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppPlayKeyResponseBody</p>
     */
    public static class AppPlayKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("PlayKey")
        private String playKey;

        private AppPlayKey(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.modificationTime = builder.modificationTime;
            this.playKey = builder.playKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPlayKey create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return playKey
         */
        public String getPlayKey() {
            return this.playKey;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String modificationTime; 
            private String playKey; 

            private Builder() {
            } 

            private Builder(AppPlayKey model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.modificationTime = model.modificationTime;
                this.playKey = model.playKey;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-1000000</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-18T03:59:01Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The update time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-18T03:59:01Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The playback key.</p>
             * <ul>
             * <li>Only uppercase and lowercase letters and digits are supported. The length must be 8 to 20 characters.</li>
             * <li>Encoded in UTF-8.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yzNgTUtAl6HAuosIA</p>
             */
            public Builder playKey(String playKey) {
                this.playKey = playKey;
                return this;
            }

            public AppPlayKey build() {
                return new AppPlayKey(this);
            } 

        } 

    }
}

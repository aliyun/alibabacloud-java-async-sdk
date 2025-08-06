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
 * {@link GetVideoConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoConfigResponseBody</p>
 */
public class GetVideoConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
    private String downloadSwitch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoConfigResponseBody(Builder builder) {
        this.downloadSwitch = builder.downloadSwitch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadSwitch
     */
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadSwitch; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVideoConfigResponseBody model) {
            this.downloadSwitch = model.downloadSwitch;
            this.requestId = model.requestId;
        } 

        /**
         * DownloadSwitch.
         */
        public Builder downloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoConfigResponseBody build() {
            return new GetVideoConfigResponseBody(this);
        } 

    } 

}

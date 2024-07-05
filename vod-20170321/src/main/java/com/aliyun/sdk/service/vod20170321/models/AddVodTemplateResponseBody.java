// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>AddVodTemplateResponseBody</p>
 */
public class AddVodTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VodTemplateId")
    private String vodTemplateId;

    private AddVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodTemplateId
     */
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public static final class Builder {
        private String requestId; 
        private String vodTemplateId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the snapshot template. You can call the [SubmitSnapshotJob](~~72213~~) operation to submit snapshot jobs.
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        public AddVodTemplateResponseBody build() {
            return new AddVodTemplateResponseBody(this);
        } 

    } 

}

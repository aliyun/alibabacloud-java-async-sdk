// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetYzdInstanceTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetYzdInstanceTaskResultRequest</p>
 */
public class GetYzdInstanceTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private GetYzdInstanceTaskResultRequestBody body;

    private GetYzdInstanceTaskResultRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYzdInstanceTaskResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GetYzdInstanceTaskResultRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetYzdInstanceTaskResultRequest, Builder> {
        private GetYzdInstanceTaskResultRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetYzdInstanceTaskResultRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(GetYzdInstanceTaskResultRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GetYzdInstanceTaskResultRequest build() {
            return new GetYzdInstanceTaskResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetYzdInstanceTaskResultRequest} extends {@link TeaModel}
     *
     * <p>GetYzdInstanceTaskResultRequest</p>
     */
    public static class GetYzdInstanceTaskResultRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("rangeTimeEndTime")
        private String rangeTimeEndTime;

        @com.aliyun.core.annotation.NameInMap("rangeTimeStartTime")
        private String rangeTimeStartTime;

        private GetYzdInstanceTaskResultRequestBody(Builder builder) {
            this.appId = builder.appId;
            this.rangeTimeEndTime = builder.rangeTimeEndTime;
            this.rangeTimeStartTime = builder.rangeTimeStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetYzdInstanceTaskResultRequestBody create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return rangeTimeEndTime
         */
        public String getRangeTimeEndTime() {
            return this.rangeTimeEndTime;
        }

        /**
         * @return rangeTimeStartTime
         */
        public String getRangeTimeStartTime() {
            return this.rangeTimeStartTime;
        }

        public static final class Builder {
            private String appId; 
            private String rangeTimeEndTime; 
            private String rangeTimeStartTime; 

            private Builder() {
            } 

            private Builder(GetYzdInstanceTaskResultRequestBody model) {
                this.appId = model.appId;
                this.rangeTimeEndTime = model.rangeTimeEndTime;
                this.rangeTimeStartTime = model.rangeTimeStartTime;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * rangeTimeEndTime.
             */
            public Builder rangeTimeEndTime(String rangeTimeEndTime) {
                this.rangeTimeEndTime = rangeTimeEndTime;
                return this;
            }

            /**
             * rangeTimeStartTime.
             */
            public Builder rangeTimeStartTime(String rangeTimeStartTime) {
                this.rangeTimeStartTime = rangeTimeStartTime;
                return this;
            }

            public GetYzdInstanceTaskResultRequestBody build() {
                return new GetYzdInstanceTaskResultRequestBody(this);
            } 

        } 

    }
}

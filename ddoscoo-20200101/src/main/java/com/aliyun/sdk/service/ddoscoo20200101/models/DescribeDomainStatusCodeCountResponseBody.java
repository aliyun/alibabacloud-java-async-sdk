// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainStatusCodeCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatusCodeCountResponseBody</p>
 */
public class DescribeDomainStatusCodeCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status200")
    private Long status200;

    @com.aliyun.core.annotation.NameInMap("Status2XX")
    private Long status2XX;

    @com.aliyun.core.annotation.NameInMap("Status3XX")
    private Long status3XX;

    @com.aliyun.core.annotation.NameInMap("Status403")
    private Long status403;

    @com.aliyun.core.annotation.NameInMap("Status404")
    private Long status404;

    @com.aliyun.core.annotation.NameInMap("Status405")
    private Long status405;

    @com.aliyun.core.annotation.NameInMap("Status410")
    private Long status410;

    @com.aliyun.core.annotation.NameInMap("Status499")
    private Long status499;

    @com.aliyun.core.annotation.NameInMap("Status4XX")
    private Long status4XX;

    @com.aliyun.core.annotation.NameInMap("Status501")
    private Long status501;

    @com.aliyun.core.annotation.NameInMap("Status502")
    private Long status502;

    @com.aliyun.core.annotation.NameInMap("Status503")
    private Long status503;

    @com.aliyun.core.annotation.NameInMap("Status504")
    private Long status504;

    @com.aliyun.core.annotation.NameInMap("Status5XX")
    private Long status5XX;

    private DescribeDomainStatusCodeCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status200 = builder.status200;
        this.status2XX = builder.status2XX;
        this.status3XX = builder.status3XX;
        this.status403 = builder.status403;
        this.status404 = builder.status404;
        this.status405 = builder.status405;
        this.status410 = builder.status410;
        this.status499 = builder.status499;
        this.status4XX = builder.status4XX;
        this.status501 = builder.status501;
        this.status502 = builder.status502;
        this.status503 = builder.status503;
        this.status504 = builder.status504;
        this.status5XX = builder.status5XX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainStatusCodeCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status200
     */
    public Long getStatus200() {
        return this.status200;
    }

    /**
     * @return status2XX
     */
    public Long getStatus2XX() {
        return this.status2XX;
    }

    /**
     * @return status3XX
     */
    public Long getStatus3XX() {
        return this.status3XX;
    }

    /**
     * @return status403
     */
    public Long getStatus403() {
        return this.status403;
    }

    /**
     * @return status404
     */
    public Long getStatus404() {
        return this.status404;
    }

    /**
     * @return status405
     */
    public Long getStatus405() {
        return this.status405;
    }

    /**
     * @return status410
     */
    public Long getStatus410() {
        return this.status410;
    }

    /**
     * @return status499
     */
    public Long getStatus499() {
        return this.status499;
    }

    /**
     * @return status4XX
     */
    public Long getStatus4XX() {
        return this.status4XX;
    }

    /**
     * @return status501
     */
    public Long getStatus501() {
        return this.status501;
    }

    /**
     * @return status502
     */
    public Long getStatus502() {
        return this.status502;
    }

    /**
     * @return status503
     */
    public Long getStatus503() {
        return this.status503;
    }

    /**
     * @return status504
     */
    public Long getStatus504() {
        return this.status504;
    }

    /**
     * @return status5XX
     */
    public Long getStatus5XX() {
        return this.status5XX;
    }

    public static final class Builder {
        private String requestId; 
        private Long status200; 
        private Long status2XX; 
        private Long status3XX; 
        private Long status403; 
        private Long status404; 
        private Long status405; 
        private Long status410; 
        private Long status499; 
        private Long status4XX; 
        private Long status501; 
        private Long status502; 
        private Long status503; 
        private Long status504; 
        private Long status5XX; 

        private Builder() {
        } 

        private Builder(DescribeDomainStatusCodeCountResponseBody model) {
            this.requestId = model.requestId;
            this.status200 = model.status200;
            this.status2XX = model.status2XX;
            this.status3XX = model.status3XX;
            this.status403 = model.status403;
            this.status404 = model.status404;
            this.status405 = model.status405;
            this.status410 = model.status410;
            this.status499 = model.status499;
            this.status4XX = model.status4XX;
            this.status501 = model.status501;
            this.status502 = model.status502;
            this.status503 = model.status503;
            this.status504 = model.status504;
            this.status5XX = model.status5XX;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of 200 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>951159</p>
         */
        public Builder status200(Long status200) {
            this.status200 = status200;
            return this;
        }

        /**
         * <p>The number of 2xx status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>951472</p>
         */
        public Builder status2XX(Long status2XX) {
            this.status2XX = status2XX;
            return this;
        }

        /**
         * <p>The number of 3xx status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>133209</p>
         */
        public Builder status3XX(Long status3XX) {
            this.status3XX = status3XX;
            return this;
        }

        /**
         * <p>The number of 403 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status403(Long status403) {
            this.status403 = status403;
            return this;
        }

        /**
         * <p>The number of 404 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>897</p>
         */
        public Builder status404(Long status404) {
            this.status404 = status404;
            return this;
        }

        /**
         * <p>The number of 405 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status405(Long status405) {
            this.status405 = status405;
            return this;
        }

        /**
         * Status410.
         */
        public Builder status410(Long status410) {
            this.status410 = status410;
            return this;
        }

        /**
         * Status499.
         */
        public Builder status499(Long status499) {
            this.status499 = status499;
            return this;
        }

        /**
         * <p>The number of 4xx status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>5653</p>
         */
        public Builder status4XX(Long status4XX) {
            this.status4XX = status4XX;
            return this;
        }

        /**
         * <p>The number of 501 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status501(Long status501) {
            this.status501 = status501;
            return this;
        }

        /**
         * <p>The number of 502 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status502(Long status502) {
            this.status502 = status502;
            return this;
        }

        /**
         * <p>The number of 503 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status503(Long status503) {
            this.status503 = status503;
            return this;
        }

        /**
         * <p>The number of 504 status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status504(Long status504) {
            this.status504 = status504;
            return this;
        }

        /**
         * <p>The number of 5xx status codes within the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder status5XX(Long status5XX) {
            this.status5XX = status5XX;
            return this;
        }

        public DescribeDomainStatusCodeCountResponseBody build() {
            return new DescribeDomainStatusCodeCountResponseBody(this);
        } 

    } 

}

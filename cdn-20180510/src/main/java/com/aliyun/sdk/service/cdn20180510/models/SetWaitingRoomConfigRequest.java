// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetWaitingRoomConfigRequest} extends {@link RequestModel}
 *
 * <p>SetWaitingRoomConfigRequest</p>
 */
public class SetWaitingRoomConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowPct")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer allowPct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GapTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer gapTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTimeWait")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxTimeWait;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitUri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitUrl;

    private SetWaitingRoomConfigRequest(Builder builder) {
        super(builder);
        this.allowPct = builder.allowPct;
        this.domainName = builder.domainName;
        this.gapTime = builder.gapTime;
        this.maxTimeWait = builder.maxTimeWait;
        this.waitUri = builder.waitUri;
        this.waitUrl = builder.waitUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWaitingRoomConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowPct
     */
    public Integer getAllowPct() {
        return this.allowPct;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return gapTime
     */
    public Integer getGapTime() {
        return this.gapTime;
    }

    /**
     * @return maxTimeWait
     */
    public Integer getMaxTimeWait() {
        return this.maxTimeWait;
    }

    /**
     * @return waitUri
     */
    public String getWaitUri() {
        return this.waitUri;
    }

    /**
     * @return waitUrl
     */
    public String getWaitUrl() {
        return this.waitUrl;
    }

    public static final class Builder extends Request.Builder<SetWaitingRoomConfigRequest, Builder> {
        private Integer allowPct; 
        private String domainName; 
        private Integer gapTime; 
        private Integer maxTimeWait; 
        private String waitUri; 
        private String waitUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetWaitingRoomConfigRequest request) {
            super(request);
            this.allowPct = request.allowPct;
            this.domainName = request.domainName;
            this.gapTime = request.gapTime;
            this.maxTimeWait = request.maxTimeWait;
            this.waitUri = request.waitUri;
            this.waitUrl = request.waitUrl;
        } 

        /**
         * <p>The percentage of requests that are allowed to be redirected to the origin server. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder allowPct(Integer allowPct) {
            this.putQueryParameter("AllowPct", allowPct);
            this.allowPct = allowPct;
            return this;
        }

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The length of waiting time to skip after an exit from the queue. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder gapTime(Integer gapTime) {
            this.putQueryParameter("GapTime", gapTime);
            this.gapTime = gapTime;
            return this;
        }

        /**
         * <p>The maximum length of waiting time in the queue. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxTimeWait(Integer maxTimeWait) {
            this.putQueryParameter("MaxTimeWait", maxTimeWait);
            this.maxTimeWait = maxTimeWait;
            return this;
        }

        /**
         * <p>The regular expression that is used to match URI strings for which the virtual waiting room feature is enabled.</p>
         * <p>This parameter is required.</p>
         */
        public Builder waitUri(String waitUri) {
            this.putQueryParameter("WaitUri", waitUri);
            this.waitUri = waitUri;
            return this;
        }

        /**
         * <p>The URL of the waiting page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/waitingroom.html">https://example.com/waitingroom.html</a></p>
         */
        public Builder waitUrl(String waitUrl) {
            this.putQueryParameter("WaitUrl", waitUrl);
            this.waitUrl = waitUrl;
            return this;
        }

        @Override
        public SetWaitingRoomConfigRequest build() {
            return new SetWaitingRoomConfigRequest(this);
        } 

    } 

}

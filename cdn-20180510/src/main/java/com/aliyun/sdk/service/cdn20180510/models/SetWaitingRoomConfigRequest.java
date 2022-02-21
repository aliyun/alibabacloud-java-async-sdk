// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWaitingRoomConfigRequest} extends {@link RequestModel}
 *
 * <p>SetWaitingRoomConfigRequest</p>
 */
public class SetWaitingRoomConfigRequest extends Request {
    @Query
    @NameInMap("AllowPct")
    @Validation(required = true)
    private Integer allowPct;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GapTime")
    @Validation(required = true)
    private Integer gapTime;

    @Query
    @NameInMap("MaxTimeWait")
    @Validation(required = true)
    private Integer maxTimeWait;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("WaitUri")
    @Validation(required = true)
    private String waitUri;

    @Query
    @NameInMap("WaitUrl")
    @Validation(required = true)
    private String waitUrl;

    private SetWaitingRoomConfigRequest(Builder builder) {
        super(builder);
        this.allowPct = builder.allowPct;
        this.domainName = builder.domainName;
        this.gapTime = builder.gapTime;
        this.maxTimeWait = builder.maxTimeWait;
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String waitUri; 
        private String waitUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetWaitingRoomConfigRequest response) {
            super(response);
            this.allowPct = response.allowPct;
            this.domainName = response.domainName;
            this.gapTime = response.gapTime;
            this.maxTimeWait = response.maxTimeWait;
            this.ownerId = response.ownerId;
            this.waitUri = response.waitUri;
            this.waitUrl = response.waitUrl;
        } 

        /**
         * AllowPct.
         */
        public Builder allowPct(Integer allowPct) {
            this.putQueryParameter("AllowPct", allowPct);
            this.allowPct = allowPct;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * GapTime.
         */
        public Builder gapTime(Integer gapTime) {
            this.putQueryParameter("GapTime", gapTime);
            this.gapTime = gapTime;
            return this;
        }

        /**
         * MaxTimeWait.
         */
        public Builder maxTimeWait(Integer maxTimeWait) {
            this.putQueryParameter("MaxTimeWait", maxTimeWait);
            this.maxTimeWait = maxTimeWait;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * WaitUri.
         */
        public Builder waitUri(String waitUri) {
            this.putQueryParameter("WaitUri", waitUri);
            this.waitUri = waitUri;
            return this;
        }

        /**
         * WaitUrl.
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

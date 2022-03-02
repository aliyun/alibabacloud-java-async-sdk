// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketWormResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketWormResponseBody</p>
 */
public class GetBucketWormResponseBody extends TeaModel {
    @ParentIgnore("WormConfiguration")
    @NameInMap("CreationDate")
    private String creationDate;

    @ParentIgnore("WormConfiguration")
    @NameInMap("RetentionPeriodInDays")
    private Integer retentionPeriodInDays;

    @ParentIgnore("WormConfiguration")
    @NameInMap("State")
    private String state;

    @ParentIgnore("WormConfiguration")
    @NameInMap("WormId")
    private String wormId;

    private GetBucketWormResponseBody(Builder builder) {
        this.creationDate = builder.creationDate;
        this.retentionPeriodInDays = builder.retentionPeriodInDays;
        this.state = builder.state;
        this.wormId = builder.wormId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWormResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationDate
     */
    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * @return retentionPeriodInDays
     */
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return wormId
     */
    public String getWormId() {
        return this.wormId;
    }

    public static final class Builder {
        private String creationDate; 
        private Integer retentionPeriodInDays; 
        private String state; 
        private String wormId; 

        /**
         * CreationDate.
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * RetentionPeriodInDays.
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * State.
         */
        public Builder state(BucketWormState state) {
            this.state = state.getValue();
            return this;
        }

        /**
         * WormId.
         */
        public Builder wormId(String wormId) {
            this.wormId = wormId;
            return this;
        }

        public GetBucketWormResponseBody build() {
            return new GetBucketWormResponseBody(this);
        } 

    } 

}

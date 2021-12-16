// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    private Long retentionPeriodInDays;

    @ParentIgnore("WormConfiguration")
    @NameInMap("State")
    private BucketWormState state;

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
    public Long getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * @return state
     */
    public BucketWormState getState() {
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
        private Long retentionPeriodInDays; 
        private BucketWormState state; 
        private String wormId; 

        /**
         * <p>CreationDate.</p>
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * <p>RetentionPeriodInDays.</p>
         */
        public Builder retentionPeriodInDays(Long retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        /**
         * <p>State.</p>
         */
        public Builder state(BucketWormState state) {
            this.state = state;
            return this;
        }

        /**
         * <p>WormId.</p>
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

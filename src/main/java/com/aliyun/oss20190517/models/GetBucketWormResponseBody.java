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
    @NameInMap("WormId")
    private String wormId;

    @ParentIgnore("WormConfiguration")
    @NameInMap("State")
    private BucketWormState state;

    @ParentIgnore("WormConfiguration")
    @NameInMap("RetentionPeriodInDays")
    private Long retentionPeriodInDays;

    @ParentIgnore("WormConfiguration")
    @NameInMap("CreationDate")
    private String creationDate;


    private GetBucketWormResponseBody(Builder builder) {
        this.wormId = builder.wormId;
        this.state = builder.state;
        this.retentionPeriodInDays = builder.retentionPeriodInDays;
        this.creationDate = builder.creationDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWormResponseBody create() {
        return builder().build();
    }

    /**
     * @return wormId
     */
    public String wormId() {
        return this.wormId;
    }

    /**
     * @return state
     */
    public BucketWormState state() {
        return this.state;
    }

    /**
     * @return retentionPeriodInDays
     */
    public Long retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * @return creationDate
     */
    public String creationDate() {
        return this.creationDate;
    }

    public static final class Builder {
        private String wormId; 
        private BucketWormState state; 
        private Long retentionPeriodInDays; 
        private String creationDate; 

        /**
         * <p>WormId.</p>
         */
        public Builder wormId(String wormId) {
            this.wormId = wormId;
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
         * <p>RetentionPeriodInDays.</p>
         */
        public Builder retentionPeriodInDays(Long retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        /**
         * <p>CreationDate.</p>
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public GetBucketWormResponseBody build() {
            return new GetBucketWormResponseBody(this);
        } 

    } 

}

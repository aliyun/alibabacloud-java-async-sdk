// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListLiveChannelResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveChannelResponseBody</p>
 */
public class ListLiveChannelResponseBody extends TeaModel {
    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("Marker")
    private String marker;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("MaxKeys")
    private Long maxKeys;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("NextMarker")
    private String nextMarker;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("LiveChannel")
    private java.util.List < LiveChannel > liveChannels;


    private ListLiveChannelResponseBody(Builder builder) {
        this.prefix = builder.prefix;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.isTruncated = builder.isTruncated;
        this.nextMarker = builder.nextMarker;
        this.liveChannels = builder.liveChannels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * @return marker
     */
    public String marker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long maxKeys() {
        return this.maxKeys;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextMarker
     */
    public String nextMarker() {
        return this.nextMarker;
    }

    /**
     * @return liveChannels
     */
    public java.util.List < LiveChannel > liveChannels() {
        return this.liveChannels;
    }

    public static final class Builder {
        private String prefix; 
        private String marker; 
        private Long maxKeys; 
        private Boolean isTruncated; 
        private String nextMarker; 
        private java.util.List < LiveChannel > liveChannels; 

        /**
         * <p>Prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>Marker.</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>MaxKeys.</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>NextMarker.</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>LiveChannel.</p>
         */
        public Builder liveChannels(java.util.List < LiveChannel > liveChannels) {
            this.liveChannels = liveChannels;
            return this;
        }

        public ListLiveChannelResponseBody build() {
            return new ListLiveChannelResponseBody(this);
        } 

    } 

}

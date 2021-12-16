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
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("LiveChannel")
    private java.util.List < LiveChannel > liveChannels;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("Marker")
    private String marker;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("MaxKeys")
    private Long maxKeys;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("NextMarker")
    private String nextMarker;

    @ParentIgnore("ListLiveChannelResult")
    @NameInMap("Prefix")
    private String prefix;


    private ListLiveChannelResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.liveChannels = builder.liveChannels;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.nextMarker = builder.nextMarker;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return liveChannels
     */
    public java.util.List < LiveChannel > getLiveChannels() {
        return this.liveChannels;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private java.util.List < LiveChannel > liveChannels; 
        private String marker; 
        private Long maxKeys; 
        private String nextMarker; 
        private String prefix; 

        /**
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>LiveChannel.</p>
         */
        public Builder liveChannels(java.util.List < LiveChannel > liveChannels) {
            this.liveChannels = liveChannels;
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
         * <p>NextMarker.</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>Prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public ListLiveChannelResponseBody build() {
            return new ListLiveChannelResponseBody(this);
        } 

    } 

}

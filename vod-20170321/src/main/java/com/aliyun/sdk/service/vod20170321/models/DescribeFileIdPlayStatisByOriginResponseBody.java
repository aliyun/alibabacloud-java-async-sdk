// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeFileIdPlayStatisByOriginResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileIdPlayStatisByOriginResponseBody</p>
 */
public class DescribeFileIdPlayStatisByOriginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePlayStatisList")
    private java.util.List<FilePlayStatisList> filePlayStatisList;

    @com.aliyun.core.annotation.NameInMap("HasNext")
    private Boolean hasNext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScrollToken")
    private String scrollToken;

    private DescribeFileIdPlayStatisByOriginResponseBody(Builder builder) {
        this.filePlayStatisList = builder.filePlayStatisList;
        this.hasNext = builder.hasNext;
        this.requestId = builder.requestId;
        this.scrollToken = builder.scrollToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileIdPlayStatisByOriginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePlayStatisList
     */
    public java.util.List<FilePlayStatisList> getFilePlayStatisList() {
        return this.filePlayStatisList;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    public static final class Builder {
        private java.util.List<FilePlayStatisList> filePlayStatisList; 
        private Boolean hasNext; 
        private String requestId; 
        private String scrollToken; 

        private Builder() {
        } 

        private Builder(DescribeFileIdPlayStatisByOriginResponseBody model) {
            this.filePlayStatisList = model.filePlayStatisList;
            this.hasNext = model.hasNext;
            this.requestId = model.requestId;
            this.scrollToken = model.scrollToken;
        } 

        /**
         * FilePlayStatisList.
         */
        public Builder filePlayStatisList(java.util.List<FilePlayStatisList> filePlayStatisList) {
            this.filePlayStatisList = filePlayStatisList;
            return this;
        }

        /**
         * HasNext.
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScrollToken.
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        public DescribeFileIdPlayStatisByOriginResponseBody build() {
            return new DescribeFileIdPlayStatisByOriginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileIdPlayStatisByOriginResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileIdPlayStatisByOriginResponseBody</p>
     */
    public static class FilePlayStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Flux")
        private Long flux;

        @com.aliyun.core.annotation.NameInMap("PlayCount")
        private Long playCount;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("StatisTime")
        private String statisTime;

        private FilePlayStatisList(Builder builder) {
            this.fileId = builder.fileId;
            this.flux = builder.flux;
            this.playCount = builder.playCount;
            this.requestCount = builder.requestCount;
            this.statisTime = builder.statisTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePlayStatisList create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return flux
         */
        public Long getFlux() {
            return this.flux;
        }

        /**
         * @return playCount
         */
        public Long getPlayCount() {
            return this.playCount;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return statisTime
         */
        public String getStatisTime() {
            return this.statisTime;
        }

        public static final class Builder {
            private String fileId; 
            private Long flux; 
            private Long playCount; 
            private Long requestCount; 
            private String statisTime; 

            private Builder() {
            } 

            private Builder(FilePlayStatisList model) {
                this.fileId = model.fileId;
                this.flux = model.flux;
                this.playCount = model.playCount;
                this.requestCount = model.requestCount;
                this.statisTime = model.statisTime;
            } 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Flux.
             */
            public Builder flux(Long flux) {
                this.flux = flux;
                return this;
            }

            /**
             * PlayCount.
             */
            public Builder playCount(Long playCount) {
                this.playCount = playCount;
                return this;
            }

            /**
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * StatisTime.
             */
            public Builder statisTime(String statisTime) {
                this.statisTime = statisTime;
                return this;
            }

            public FilePlayStatisList build() {
                return new FilePlayStatisList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenTitlesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenTitlesResponseBody</p>
 */
public class DescribeScreenTitlesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasScreenSettingList")
    private java.util.List<SasScreenSettingList> sasScreenSettingList;

    private DescribeScreenTitlesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sasScreenSettingList = builder.sasScreenSettingList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenTitlesResponseBody create() {
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
     * @return sasScreenSettingList
     */
    public java.util.List<SasScreenSettingList> getSasScreenSettingList() {
        return this.sasScreenSettingList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SasScreenSettingList> sasScreenSettingList; 

        private Builder() {
        } 

        private Builder(DescribeScreenTitlesResponseBody model) {
            this.requestId = model.requestId;
            this.sasScreenSettingList = model.sasScreenSettingList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasScreenSettingList.
         */
        public Builder sasScreenSettingList(java.util.List<SasScreenSettingList> sasScreenSettingList) {
            this.sasScreenSettingList = sasScreenSettingList;
            return this;
        }

        public DescribeScreenTitlesResponseBody build() {
            return new DescribeScreenTitlesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenTitlesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenTitlesResponseBody</p>
     */
    public static class SasScreenSettingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScreenID")
        private Long screenID;

        @com.aliyun.core.annotation.NameInMap("ScreenTitle")
        private String screenTitle;

        private SasScreenSettingList(Builder builder) {
            this.screenID = builder.screenID;
            this.screenTitle = builder.screenTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasScreenSettingList create() {
            return builder().build();
        }

        /**
         * @return screenID
         */
        public Long getScreenID() {
            return this.screenID;
        }

        /**
         * @return screenTitle
         */
        public String getScreenTitle() {
            return this.screenTitle;
        }

        public static final class Builder {
            private Long screenID; 
            private String screenTitle; 

            private Builder() {
            } 

            private Builder(SasScreenSettingList model) {
                this.screenID = model.screenID;
                this.screenTitle = model.screenTitle;
            } 

            /**
             * ScreenID.
             */
            public Builder screenID(Long screenID) {
                this.screenID = screenID;
                return this;
            }

            /**
             * ScreenTitle.
             */
            public Builder screenTitle(String screenTitle) {
                this.screenTitle = screenTitle;
                return this;
            }

            public SasScreenSettingList build() {
                return new SasScreenSettingList(this);
            } 

        } 

    }
}

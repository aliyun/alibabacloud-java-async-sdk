// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChannelProperties} extends {@link TeaModel}
 *
 * <p>ChannelProperties</p>
 */
public class ChannelProperties extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelActivity")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String channelActivity;

    @com.aliyun.core.annotation.NameInMap("channelFcm")
    private String channelFcm;

    @com.aliyun.core.annotation.NameInMap("huaweiChannelCategory")
    private String huaweiChannelCategory;

    @com.aliyun.core.annotation.NameInMap("huaweiChannelImportance")
    private String huaweiChannelImportance;

    @com.aliyun.core.annotation.NameInMap("mainActivity")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String mainActivity;

    @com.aliyun.core.annotation.NameInMap("oppoChannelId")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String oppoChannelId;

    @com.aliyun.core.annotation.NameInMap("vivoAddBadge")
    private String vivoAddBadge;

    @com.aliyun.core.annotation.NameInMap("vivoCategory")
    private String vivoCategory;

    @com.aliyun.core.annotation.NameInMap("xiaomiChannelId")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String xiaomiChannelId;

    private ChannelProperties(Builder builder) {
        this.channelActivity = builder.channelActivity;
        this.channelFcm = builder.channelFcm;
        this.huaweiChannelCategory = builder.huaweiChannelCategory;
        this.huaweiChannelImportance = builder.huaweiChannelImportance;
        this.mainActivity = builder.mainActivity;
        this.oppoChannelId = builder.oppoChannelId;
        this.vivoAddBadge = builder.vivoAddBadge;
        this.vivoCategory = builder.vivoCategory;
        this.xiaomiChannelId = builder.xiaomiChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelProperties create() {
        return builder().build();
    }

    /**
     * @return channelActivity
     */
    public String getChannelActivity() {
        return this.channelActivity;
    }

    /**
     * @return channelFcm
     */
    public String getChannelFcm() {
        return this.channelFcm;
    }

    /**
     * @return huaweiChannelCategory
     */
    public String getHuaweiChannelCategory() {
        return this.huaweiChannelCategory;
    }

    /**
     * @return huaweiChannelImportance
     */
    public String getHuaweiChannelImportance() {
        return this.huaweiChannelImportance;
    }

    /**
     * @return mainActivity
     */
    public String getMainActivity() {
        return this.mainActivity;
    }

    /**
     * @return oppoChannelId
     */
    public String getOppoChannelId() {
        return this.oppoChannelId;
    }

    /**
     * @return vivoAddBadge
     */
    public String getVivoAddBadge() {
        return this.vivoAddBadge;
    }

    /**
     * @return vivoCategory
     */
    public String getVivoCategory() {
        return this.vivoCategory;
    }

    /**
     * @return xiaomiChannelId
     */
    public String getXiaomiChannelId() {
        return this.xiaomiChannelId;
    }

    public static final class Builder {
        private String channelActivity; 
        private String channelFcm; 
        private String huaweiChannelCategory; 
        private String huaweiChannelImportance; 
        private String mainActivity; 
        private String oppoChannelId; 
        private String vivoAddBadge; 
        private String vivoCategory; 
        private String xiaomiChannelId; 

        /**
         * channelActivity.
         */
        public Builder channelActivity(String channelActivity) {
            this.channelActivity = channelActivity;
            return this;
        }

        /**
         * channelFcm.
         */
        public Builder channelFcm(String channelFcm) {
            this.channelFcm = channelFcm;
            return this;
        }

        /**
         * huaweiChannelCategory.
         */
        public Builder huaweiChannelCategory(String huaweiChannelCategory) {
            this.huaweiChannelCategory = huaweiChannelCategory;
            return this;
        }

        /**
         * huaweiChannelImportance.
         */
        public Builder huaweiChannelImportance(String huaweiChannelImportance) {
            this.huaweiChannelImportance = huaweiChannelImportance;
            return this;
        }

        /**
         * mainActivity.
         */
        public Builder mainActivity(String mainActivity) {
            this.mainActivity = mainActivity;
            return this;
        }

        /**
         * oppoChannelId.
         */
        public Builder oppoChannelId(String oppoChannelId) {
            this.oppoChannelId = oppoChannelId;
            return this;
        }

        /**
         * vivoAddBadge.
         */
        public Builder vivoAddBadge(String vivoAddBadge) {
            this.vivoAddBadge = vivoAddBadge;
            return this;
        }

        /**
         * vivoCategory.
         */
        public Builder vivoCategory(String vivoCategory) {
            this.vivoCategory = vivoCategory;
            return this;
        }

        /**
         * xiaomiChannelId.
         */
        public Builder xiaomiChannelId(String xiaomiChannelId) {
            this.xiaomiChannelId = xiaomiChannelId;
            return this;
        }

        public ChannelProperties build() {
            return new ChannelProperties(this);
        } 

    } 

}

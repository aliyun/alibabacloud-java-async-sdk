// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link RecycleBinConfig} extends {@link TeaModel}
 *
 * <p>RecycleBinConfig</p>
 */
public class RecycleBinConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_delete_enabled")
    private Boolean autoDeleteEnabled;

    @com.aliyun.core.annotation.NameInMap("auto_delete_keep_second")
    private Integer autoDeleteKeepSecond;

    @com.aliyun.core.annotation.NameInMap("delete_trash_normal_file_disabled")
    private Boolean deleteTrashNormalFileDisabled;

    private RecycleBinConfig(Builder builder) {
        this.autoDeleteEnabled = builder.autoDeleteEnabled;
        this.autoDeleteKeepSecond = builder.autoDeleteKeepSecond;
        this.deleteTrashNormalFileDisabled = builder.deleteTrashNormalFileDisabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecycleBinConfig create() {
        return builder().build();
    }

    /**
     * @return autoDeleteEnabled
     */
    public Boolean getAutoDeleteEnabled() {
        return this.autoDeleteEnabled;
    }

    /**
     * @return autoDeleteKeepSecond
     */
    public Integer getAutoDeleteKeepSecond() {
        return this.autoDeleteKeepSecond;
    }

    /**
     * @return deleteTrashNormalFileDisabled
     */
    public Boolean getDeleteTrashNormalFileDisabled() {
        return this.deleteTrashNormalFileDisabled;
    }

    public static final class Builder {
        private Boolean autoDeleteEnabled; 
        private Integer autoDeleteKeepSecond; 
        private Boolean deleteTrashNormalFileDisabled; 

        /**
         * auto_delete_enabled.
         */
        public Builder autoDeleteEnabled(Boolean autoDeleteEnabled) {
            this.autoDeleteEnabled = autoDeleteEnabled;
            return this;
        }

        /**
         * auto_delete_keep_second.
         */
        public Builder autoDeleteKeepSecond(Integer autoDeleteKeepSecond) {
            this.autoDeleteKeepSecond = autoDeleteKeepSecond;
            return this;
        }

        /**
         * delete_trash_normal_file_disabled.
         */
        public Builder deleteTrashNormalFileDisabled(Boolean deleteTrashNormalFileDisabled) {
            this.deleteTrashNormalFileDisabled = deleteTrashNormalFileDisabled;
            return this;
        }

        public RecycleBinConfig build() {
            return new RecycleBinConfig(this);
        } 

    } 

}

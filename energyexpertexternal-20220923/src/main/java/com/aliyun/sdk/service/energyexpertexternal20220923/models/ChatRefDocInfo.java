// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatRefDocInfo} extends {@link TeaModel}
 *
 * <p>ChatRefDocInfo</p>
 */
public class ChatRefDocInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageListInfo")
    private java.util.List<ChatRefDocPageInfo> pageListInfo;

    @com.aliyun.core.annotation.NameInMap("pages")
    private Long pages;

    private ChatRefDocInfo(Builder builder) {
        this.pageListInfo = builder.pageListInfo;
        this.pages = builder.pages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRefDocInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageListInfo
     */
    public java.util.List<ChatRefDocPageInfo> getPageListInfo() {
        return this.pageListInfo;
    }

    /**
     * @return pages
     */
    public Long getPages() {
        return this.pages;
    }

    public static final class Builder {
        private java.util.List<ChatRefDocPageInfo> pageListInfo; 
        private Long pages; 

        private Builder() {
        } 

        private Builder(ChatRefDocInfo model) {
            this.pageListInfo = model.pageListInfo;
            this.pages = model.pages;
        } 

        /**
         * pageListInfo.
         */
        public Builder pageListInfo(java.util.List<ChatRefDocPageInfo> pageListInfo) {
            this.pageListInfo = pageListInfo;
            return this;
        }

        /**
         * pages.
         */
        public Builder pages(Long pages) {
            this.pages = pages;
            return this;
        }

        public ChatRefDocInfo build() {
            return new ChatRefDocInfo(this);
        } 

    } 

}

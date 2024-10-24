// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TextThemeListResult} extends {@link TeaModel}
 *
 * <p>TextThemeListResult</p>
 */
public class TextThemeListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("textThemeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < TextTheme > textThemeList;

    private TextThemeListResult(Builder builder) {
        this.requestId = builder.requestId;
        this.textThemeList = builder.textThemeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextThemeListResult create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return textThemeList
     */
    public java.util.List < TextTheme > getTextThemeList() {
        return this.textThemeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TextTheme > textThemeList; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder textThemeList(java.util.List < TextTheme > textThemeList) {
            this.textThemeList = textThemeList;
            return this;
        }

        public TextThemeListResult build() {
            return new TextThemeListResult(this);
        } 

    } 

}

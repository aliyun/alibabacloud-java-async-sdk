// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link Division} extends {@link TeaModel}
 *
 * <p>Division</p>
 */
public class Division extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private Long divisionCode;

    @com.aliyun.core.annotation.NameInMap("divisionLevel")
    private Long divisionLevel;

    @com.aliyun.core.annotation.NameInMap("divisionName")
    private String divisionName;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("pinyin")
    private String pinyin;

    private Division(Builder builder) {
        this.divisionCode = builder.divisionCode;
        this.divisionLevel = builder.divisionLevel;
        this.divisionName = builder.divisionName;
        this.parentId = builder.parentId;
        this.pinyin = builder.pinyin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Division create() {
        return builder().build();
    }

    /**
     * @return divisionCode
     */
    public Long getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return divisionLevel
     */
    public Long getDivisionLevel() {
        return this.divisionLevel;
    }

    /**
     * @return divisionName
     */
    public String getDivisionName() {
        return this.divisionName;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return pinyin
     */
    public String getPinyin() {
        return this.pinyin;
    }

    public static final class Builder {
        private Long divisionCode; 
        private Long divisionLevel; 
        private String divisionName; 
        private Long parentId; 
        private String pinyin; 

        /**
         * divisionCode.
         */
        public Builder divisionCode(Long divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * divisionLevel.
         */
        public Builder divisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }

        /**
         * divisionName.
         */
        public Builder divisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * pinyin.
         */
        public Builder pinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }

        public Division build() {
            return new Division(this);
        } 

    } 

}

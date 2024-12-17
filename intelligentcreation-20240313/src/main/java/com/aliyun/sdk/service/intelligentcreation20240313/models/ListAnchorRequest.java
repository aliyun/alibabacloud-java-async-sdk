// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAnchorRequest} extends {@link RequestModel}
 *
 * <p>ListAnchorRequest</p>
 */
public class ListAnchorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("anchorCategory")
    private String anchorCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("anchorType")
    private String anchorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("coverRate")
    private String coverRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("digitalHumanType")
    private String digitalHumanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resSpecType")
    private String resSpecType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    private ListAnchorRequest(Builder builder) {
        super(builder);
        this.anchorCategory = builder.anchorCategory;
        this.anchorType = builder.anchorType;
        this.coverRate = builder.coverRate;
        this.digitalHumanType = builder.digitalHumanType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resSpecType = builder.resSpecType;
        this.useScene = builder.useScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnchorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorCategory
     */
    public String getAnchorCategory() {
        return this.anchorCategory;
    }

    /**
     * @return anchorType
     */
    public String getAnchorType() {
        return this.anchorType;
    }

    /**
     * @return coverRate
     */
    public String getCoverRate() {
        return this.coverRate;
    }

    /**
     * @return digitalHumanType
     */
    public String getDigitalHumanType() {
        return this.digitalHumanType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resSpecType
     */
    public String getResSpecType() {
        return this.resSpecType;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    public static final class Builder extends Request.Builder<ListAnchorRequest, Builder> {
        private String anchorCategory; 
        private String anchorType; 
        private String coverRate; 
        private String digitalHumanType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resSpecType; 
        private String useScene; 

        private Builder() {
            super();
        } 

        private Builder(ListAnchorRequest request) {
            super(request);
            this.anchorCategory = request.anchorCategory;
            this.anchorType = request.anchorType;
            this.coverRate = request.coverRate;
            this.digitalHumanType = request.digitalHumanType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resSpecType = request.resSpecType;
            this.useScene = request.useScene;
        } 

        /**
         * anchorCategory.
         */
        public Builder anchorCategory(String anchorCategory) {
            this.putQueryParameter("anchorCategory", anchorCategory);
            this.anchorCategory = anchorCategory;
            return this;
        }

        /**
         * anchorType.
         */
        public Builder anchorType(String anchorType) {
            this.putQueryParameter("anchorType", anchorType);
            this.anchorType = anchorType;
            return this;
        }

        /**
         * coverRate.
         */
        public Builder coverRate(String coverRate) {
            this.putQueryParameter("coverRate", coverRate);
            this.coverRate = coverRate;
            return this;
        }

        /**
         * digitalHumanType.
         */
        public Builder digitalHumanType(String digitalHumanType) {
            this.putQueryParameter("digitalHumanType", digitalHumanType);
            this.digitalHumanType = digitalHumanType;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resSpecType.
         */
        public Builder resSpecType(String resSpecType) {
            this.putQueryParameter("resSpecType", resSpecType);
            this.resSpecType = resSpecType;
            return this;
        }

        /**
         * useScene.
         */
        public Builder useScene(String useScene) {
            this.putQueryParameter("useScene", useScene);
            this.useScene = useScene;
            return this;
        }

        @Override
        public ListAnchorRequest build() {
            return new ListAnchorRequest(this);
        } 

    } 

}

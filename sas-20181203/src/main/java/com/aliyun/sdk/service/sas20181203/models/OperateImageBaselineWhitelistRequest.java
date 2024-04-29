// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateImageBaselineWhitelistRequest} extends {@link RequestModel}
 *
 * <p>OperateImageBaselineWhitelistRequest</p>
 */
public class OperateImageBaselineWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItemKeyList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baselineItemKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    private OperateImageBaselineWhitelistRequest(Builder builder) {
        super(builder);
        this.baselineItemKeyList = builder.baselineItemKeyList;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.operation = builder.operation;
        this.scanRange = builder.scanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateImageBaselineWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineItemKeyList
     */
    public String getBaselineItemKeyList() {
        return this.baselineItemKeyList;
    }

    /**
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return scanRange
     */
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    public static final class Builder extends Request.Builder<OperateImageBaselineWhitelistRequest, Builder> {
        private String baselineItemKeyList; 
        private String imageUuid; 
        private String lang; 
        private String operation; 
        private java.util.List < String > scanRange; 

        private Builder() {
            super();
        } 

        private Builder(OperateImageBaselineWhitelistRequest request) {
            super(request);
            this.baselineItemKeyList = request.baselineItemKeyList;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.operation = request.operation;
            this.scanRange = request.scanRange;
        } 

        /**
         * The keys of baseline check items.
         */
        public Builder baselineItemKeyList(String baselineItemKeyList) {
            this.putQueryParameter("BaselineItemKeyList", baselineItemKeyList);
            this.baselineItemKeyList = baselineItemKeyList;
            return this;
        }

        /**
         * The UUID of the image.
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The operation that you want to perform on the check items. Valid values:
         * <p>
         * 
         * *   **add**: adds the check items to the whitelist
         * *   **del**: removes the check items from the whitelist
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * The types of the assets that you want to scan.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public OperateImageBaselineWhitelistRequest build() {
            return new OperateImageBaselineWhitelistRequest(this);
        } 

    } 

}

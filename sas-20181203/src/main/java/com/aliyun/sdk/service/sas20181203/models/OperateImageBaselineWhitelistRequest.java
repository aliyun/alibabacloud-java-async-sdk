// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The keys of baseline check items.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hc.image.checklist.identify.hc_exploit_es_linux.item</p>
         */
        public Builder baselineItemKeyList(String baselineItemKeyList) {
            this.putQueryParameter("BaselineItemKeyList", baselineItemKeyList);
            this.baselineItemKeyList = baselineItemKeyList;
            return this;
        }

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>a5250ebca765dc9eb1a84b790b0e****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the check items. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: adds the check items to the whitelist</li>
         * <li><strong>del</strong>: removes the check items from the whitelist</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The types of the assets that you want to scan.</p>
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

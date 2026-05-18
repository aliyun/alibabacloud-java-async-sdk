// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UploadDocumentRequest} extends {@link RequestModel}
 *
 * <p>UploadDocumentRequest</p>
 */
public class UploadDocumentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkOverlap")
    private Long chunkOverlap;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Long chunkSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentLoaderName")
    private String documentLoaderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Separators")
    private java.util.List<String> separators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SplitterModel")
    private String splitterModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TextSplitterName")
    private String textSplitterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VlEnhance")
    private Boolean vlEnhance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZhTitleEnhance")
    private Boolean zhTitleEnhance;

    private UploadDocumentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chunkOverlap = builder.chunkOverlap;
        this.chunkSize = builder.chunkSize;
        this.description = builder.description;
        this.documentLoaderName = builder.documentLoaderName;
        this.fileName = builder.fileName;
        this.kbUuid = builder.kbUuid;
        this.location = builder.location;
        this.separators = builder.separators;
        this.splitterModel = builder.splitterModel;
        this.textSplitterName = builder.textSplitterName;
        this.vlEnhance = builder.vlEnhance;
        this.zhTitleEnhance = builder.zhTitleEnhance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDocumentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chunkOverlap
     */
    public Long getChunkOverlap() {
        return this.chunkOverlap;
    }

    /**
     * @return chunkSize
     */
    public Long getChunkSize() {
        return this.chunkSize;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documentLoaderName
     */
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return separators
     */
    public java.util.List<String> getSeparators() {
        return this.separators;
    }

    /**
     * @return splitterModel
     */
    public String getSplitterModel() {
        return this.splitterModel;
    }

    /**
     * @return textSplitterName
     */
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    /**
     * @return vlEnhance
     */
    public Boolean getVlEnhance() {
        return this.vlEnhance;
    }

    /**
     * @return zhTitleEnhance
     */
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

    public static final class Builder extends Request.Builder<UploadDocumentRequest, Builder> {
        private String regionId; 
        private Long chunkOverlap; 
        private Long chunkSize; 
        private String description; 
        private String documentLoaderName; 
        private String fileName; 
        private String kbUuid; 
        private String location; 
        private java.util.List<String> separators; 
        private String splitterModel; 
        private String textSplitterName; 
        private Boolean vlEnhance; 
        private Boolean zhTitleEnhance; 

        private Builder() {
            super();
        } 

        private Builder(UploadDocumentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chunkOverlap = request.chunkOverlap;
            this.chunkSize = request.chunkSize;
            this.description = request.description;
            this.documentLoaderName = request.documentLoaderName;
            this.fileName = request.fileName;
            this.kbUuid = request.kbUuid;
            this.location = request.location;
            this.separators = request.separators;
            this.splitterModel = request.splitterModel;
            this.textSplitterName = request.textSplitterName;
            this.vlEnhance = request.vlEnhance;
            this.zhTitleEnhance = request.zhTitleEnhance;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChunkOverlap.
         */
        public Builder chunkOverlap(Long chunkOverlap) {
            this.putBodyParameter("ChunkOverlap", chunkOverlap);
            this.chunkOverlap = chunkOverlap;
            return this;
        }

        /**
         * ChunkSize.
         */
        public Builder chunkSize(Long chunkSize) {
            this.putBodyParameter("ChunkSize", chunkSize);
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DocumentLoaderName.
         */
        public Builder documentLoaderName(String documentLoaderName) {
            this.putBodyParameter("DocumentLoaderName", documentLoaderName);
            this.documentLoaderName = documentLoaderName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * Separators.
         */
        public Builder separators(java.util.List<String> separators) {
            String separatorsShrink = shrink(separators, "Separators", "json");
            this.putBodyParameter("Separators", separatorsShrink);
            this.separators = separators;
            return this;
        }

        /**
         * SplitterModel.
         */
        public Builder splitterModel(String splitterModel) {
            this.putBodyParameter("SplitterModel", splitterModel);
            this.splitterModel = splitterModel;
            return this;
        }

        /**
         * TextSplitterName.
         */
        public Builder textSplitterName(String textSplitterName) {
            this.putBodyParameter("TextSplitterName", textSplitterName);
            this.textSplitterName = textSplitterName;
            return this;
        }

        /**
         * VlEnhance.
         */
        public Builder vlEnhance(Boolean vlEnhance) {
            this.putBodyParameter("VlEnhance", vlEnhance);
            this.vlEnhance = vlEnhance;
            return this;
        }

        /**
         * ZhTitleEnhance.
         */
        public Builder zhTitleEnhance(Boolean zhTitleEnhance) {
            this.putBodyParameter("ZhTitleEnhance", zhTitleEnhance);
            this.zhTitleEnhance = zhTitleEnhance;
            return this;
        }

        @Override
        public UploadDocumentRequest build() {
            return new UploadDocumentRequest(this);
        } 

    } 

}

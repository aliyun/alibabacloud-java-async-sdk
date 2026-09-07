// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AddVirusScanAdditionalListsRequest} extends {@link RequestModel}
 *
 * <p>AddVirusScanAdditionalListsRequest</p>
 */
public class AddVirusScanAdditionalListsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdditionalLists")
    private java.util.List<AdditionalLists> additionalLists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devType;

    private AddVirusScanAdditionalListsRequest(Builder builder) {
        super(builder);
        this.additionalLists = builder.additionalLists;
        this.devType = builder.devType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirusScanAdditionalListsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalLists
     */
    public java.util.List<AdditionalLists> getAdditionalLists() {
        return this.additionalLists;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
    }

    public static final class Builder extends Request.Builder<AddVirusScanAdditionalListsRequest, Builder> {
        private java.util.List<AdditionalLists> additionalLists; 
        private String devType; 

        private Builder() {
            super();
        } 

        private Builder(AddVirusScanAdditionalListsRequest request) {
            super(request);
            this.additionalLists = request.additionalLists;
            this.devType = request.devType;
        } 

        /**
         * <p>The list of entries to append. At least one entry is required.</p>
         */
        public Builder additionalLists(java.util.List<AdditionalLists> additionalLists) {
            this.putBodyParameter("AdditionalLists", additionalLists);
            this.additionalLists = additionalLists;
            return this;
        }

        /**
         * <p>The operating system type for which the list takes effect. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows.</li>
         * <li><strong>macOS</strong>: macOS.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder devType(String devType) {
            this.putBodyParameter("DevType", devType);
            this.devType = devType;
            return this;
        }

        @Override
        public AddVirusScanAdditionalListsRequest build() {
            return new AddVirusScanAdditionalListsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddVirusScanAdditionalListsRequest} extends {@link TeaModel}
     *
     * <p>AddVirusScanAdditionalListsRequest</p>
     */
    public static class AdditionalLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalType")
        private String additionalType;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private String listType;

        private AdditionalLists(Builder builder) {
            this.additionalType = builder.additionalType;
            this.detail = builder.detail;
            this.listType = builder.listType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalLists create() {
            return builder().build();
        }

        /**
         * @return additionalType
         */
        public String getAdditionalType() {
            return this.additionalType;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return listType
         */
        public String getListType() {
            return this.listType;
        }

        public static final class Builder {
            private String additionalType; 
            private String detail; 
            private String listType; 

            private Builder() {
            } 

            private Builder(AdditionalLists model) {
                this.additionalType = model.additionalType;
                this.detail = model.detail;
                this.listType = model.listType;
            } 

            /**
             * <p>The matching dimension of the list entry. Valid values:</p>
             * <ul>
             * <li><strong>FileSuffix</strong>: matches by file name extension.</li>
             * <li><strong>FileName</strong>: matches by file name.</li>
             * <li><strong>FolderName</strong>: matches by folder name.</li>
             * <li><strong>FilePath</strong>: matches by file path.</li>
             * <li><strong>FileMd5</strong>: matches by file MD5 value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FileSuffix</p>
             */
            public Builder additionalType(String additionalType) {
                this.additionalType = additionalType;
                return this;
            }

            /**
             * <p>The content of the list entry. The value cannot exceed 255 characters. The meaning is determined by AdditionalType: when AdditionalType is set to FileSuffix, specify a file name extension. When set to FileName, specify a file name. When set to FolderName, specify a folder name. When set to FilePath, specify a file path. When set to FileMd5, specify the MD5 value of a file.</p>
             * 
             * <strong>example:</strong>
             * <p>.tmp</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The list type. Valid values:</p>
             * <ul>
             * <li><strong>Blacklist</strong>: blacklist. Files that match are directly identified as virus files.</li>
             * <li><strong>Whitelist</strong>: whitelist. Files that match are excluded from virus detection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Whitelist</p>
             */
            public Builder listType(String listType) {
                this.listType = listType;
                return this;
            }

            public AdditionalLists build() {
                return new AdditionalLists(this);
            } 

        } 

    }
}

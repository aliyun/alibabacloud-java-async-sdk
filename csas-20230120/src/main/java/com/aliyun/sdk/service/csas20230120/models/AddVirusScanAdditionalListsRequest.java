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
         * <p>The list of entries to add. The list must contain at least one entry.</p>
         */
        public Builder additionalLists(java.util.List<AdditionalLists> additionalLists) {
            this.putBodyParameter("AdditionalLists", additionalLists);
            this.additionalLists = additionalLists;
            return this;
        }

        /**
         * <p>The operating system type to which the list applies. Valid values:</p>
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
             * <li><strong>FileSuffix</strong>: Matches by file name extension.</li>
             * <li><strong>FileName</strong>: Matches by file name.</li>
             * <li><strong>FolderName</strong>: Matches by folder name.</li>
             * <li><strong>FilePath</strong>: Matches by file path.</li>
             * <li><strong>FileMd5</strong>: Matches by file MD5 hash.</li>
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
             * <p>The content of the list entry. The value can be up to 255 characters in length. The meaning of this parameter is determined by the AdditionalType parameter. If AdditionalType is set to FileSuffix, specify the file name extension. If AdditionalType is set to FileName, specify the file name. If AdditionalType is set to FolderName, specify the folder name. If AdditionalType is set to FilePath, specify the file path. If AdditionalType is set to FileMd5, specify the MD5 hash of the file.</p>
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
             * <li><strong>Blacklist</strong>: Blacklist. Matched files are directly identified as virus files.</li>
             * <li><strong>Whitelist</strong>: Whitelist. Matched files are excluded from virus detection.</li>
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

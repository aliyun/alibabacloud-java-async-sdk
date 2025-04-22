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
 * {@link BaseFileListInheritPermissionResponse} extends {@link TeaModel}
 *
 * <p>BaseFileListInheritPermissionResponse</p>
 */
public class BaseFileListInheritPermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("member")
    private FilePermissionMember member;

    private BaseFileListInheritPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.member = builder.member;
    }

    public static BaseFileListInheritPermissionResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return member
     */
    public FilePermissionMember getMember() {
        return this.member;
    }

    public interface Builder extends Response.Builder<BaseFileListInheritPermissionResponse, Builder> {

        Builder fileId(String fileId);

        Builder member(FilePermissionMember member);

        @Override
        BaseFileListInheritPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseFileListInheritPermissionResponse, Builder>
            implements Builder {
        private String fileId; 
        private FilePermissionMember member; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseFileListInheritPermissionResponse response) {
            super(response);
            this.fileId = response.fileId;
            this.member = response.member;
        } 

        /**
         * file_id.
         */
        @Override
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * member.
         */
        @Override
        public Builder member(FilePermissionMember member) {
            this.member = member;
            return this;
        }

        @Override
        public BaseFileListInheritPermissionResponse build() {
            return new BaseFileListInheritPermissionResponse(this);
        } 

    } 

}

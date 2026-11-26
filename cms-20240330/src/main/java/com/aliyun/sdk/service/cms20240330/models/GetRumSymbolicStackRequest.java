// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetRumSymbolicStackRequest} extends {@link RequestModel}
 *
 * <p>GetRumSymbolicStackRequest</p>
 */
public class GetRumSymbolicStackRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileInfo")
    private String fileInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("images")
    private String images;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid")
    @Deprecated
    private String pid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stack")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetRumSymbolicStackRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileInfo = builder.fileInfo;
        this.images = builder.images;
        this.pid = builder.pid;
        this.serviceId = builder.serviceId;
        this.stack = builder.stack;
        this.stackType = builder.stackType;
        this.threadId = builder.threadId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolicStackRequest create() {
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
     * @return fileInfo
     */
    public String getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return stack
     */
    public String getStack() {
        return this.stack;
    }

    /**
     * @return stackType
     */
    public String getStackType() {
        return this.stackType;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetRumSymbolicStackRequest, Builder> {
        private String regionId; 
        private String fileInfo; 
        private String images; 
        private String pid; 
        private String serviceId; 
        private String stack; 
        private String stackType; 
        private String threadId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetRumSymbolicStackRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileInfo = request.fileInfo;
            this.images = request.images;
            this.pid = request.pid;
            this.serviceId = request.serviceId;
            this.stack = request.stack;
            this.stackType = request.stackType;
            this.threadId = request.threadId;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The symbol file matching information, which varies based on stackType. For js, jvm, and android-native, it is a JSON string (js and jvm must contain both version and fileName, and optionally uuid/debugId; android-native supports a single module, a modules array, and il2cppMapping). For cocoa, it is a non-JSON format (module:objectKey;...) for historical compatibility only, and it is recommended to pass it through images in the new version. If matching information is missing, the symbol is not found, or parsing fails for js, an empty result is returned. If fileInfo is missing or the symbol is not found for jvm, an empty result is returned, and it falls back to the original stack only when downstream symbolication fails.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:&quot;1.0.0&quot;,&quot;fileName&quot;:&quot;mapping.txt&quot;}</p>
         */
        public Builder fileInfo(String fileInfo) {
            this.putBodyParameter("fileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * <p>The binary image information associated with Native/Cocoa crashes. The format varies based on stackType (only electron-native uses a JSON array). For cocoa, it is a line-by-line string (each line is module:arch;uuid;loadAddress). For electron-native, it is a JSON array string (elements contain name, debug_id/debugId, or code_id/codeId, and optionally load_address/loadAddress and arch). For windows-native, it is a semicolon-separated string of debugId and debugFile (.pdb file name). For macos-native, it is a semicolon-separated string of uuid and name. If matching information is missing, the symbol file is not found, or symbolication fails, Native/Cocoa types fall back to returning the original stack lines. The following example applies only to scenarios where stackType is electron-native and cannot be directly combined with stackType=jvm in a request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;Electron Framework&quot;,&quot;debug_id&quot;:&quot;ABCDEF01-2345-6789-ABCD-EF0123456789&quot;,&quot;code_id&quot;:&quot;CODE-1&quot;,&quot;load_address&quot;:&quot;0x0000000100000000&quot;,&quot;arch&quot;:&quot;arm64&quot;}]</p>
         */
        public Builder images(String images) {
            this.putBodyParameter("images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The application PID. <strong>[Deprecated]</strong> The server automatically resolves this value based on the workspace and serviceId.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxojw@e3hd38hxxxx11</p>
         */
        public Builder pid(String pid) {
            this.putBodyParameter("pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The service ID of the RUM application. This parameter is required and cannot be an empty string. It must be used together with workspace to locate the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4e5@f67890</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The original exception stack content to be symbolicated. This parameter is required and cannot be an empty string. If stackType is js, the format is &quot;line,column,rows&quot;. For other types, pass the original stack text of the corresponding platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException
         *     at com.example.Main.main(Main.java:10)</p>
         */
        public Builder stack(String stack) {
            this.putBodyParameter("stack", stack);
            this.stack = stack;
            return this;
        }

        /**
         * <p>The stack type. This parameter is required and cannot be an empty string. Valid values: js, jvm, android-native, cocoa, electron-native, windows-native, and macos-native.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jvm</p>
         */
        public Builder stackType(String stackType) {
            this.putBodyParameter("stackType", stackType);
            this.stackType = stackType;
            return this;
        }

        /**
         * <p>The ID of the exception thread.</p>
         * 
         * <strong>example:</strong>
         * <p>thread-1</p>
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        /**
         * <p>The name of the workspace to which the RUM application belongs. This parameter is required and cannot be an empty string. It must be used together with serviceId to locate the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1234567890-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetRumSymbolicStackRequest build() {
            return new GetRumSymbolicStackRequest(this);
        } 

    } 

}

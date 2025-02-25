// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartUserAppAsyncEnhanceInMsaRequest} extends {@link RequestModel}
 *
 * <p>StartUserAppAsyncEnhanceInMsaRequest</p>
 */
public class StartUserAppAsyncEnhanceInMsaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApkProtector")
    private Boolean apkProtector;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetsFileList")
    private String assetsFileList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Classes")
    private String classes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DalvikDebugger")
    private Integer dalvikDebugger;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmulatorEnvironment")
    private Integer emulatorEnvironment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JavaHook")
    private Integer javaHook;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemoryDump")
    private Integer memoryDump;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NativeDebugger")
    private Integer nativeDebugger;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NativeHook")
    private Integer nativeHook;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageTampered")
    private Integer packageTampered;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Root")
    private Integer root;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoFileList")
    private String soFileList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TotalSwitch")
    private Boolean totalSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseAShield")
    private Boolean useAShield;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private StartUserAppAsyncEnhanceInMsaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apkProtector = builder.apkProtector;
        this.appId = builder.appId;
        this.assetsFileList = builder.assetsFileList;
        this.classes = builder.classes;
        this.dalvikDebugger = builder.dalvikDebugger;
        this.emulatorEnvironment = builder.emulatorEnvironment;
        this.id = builder.id;
        this.javaHook = builder.javaHook;
        this.memoryDump = builder.memoryDump;
        this.nativeDebugger = builder.nativeDebugger;
        this.nativeHook = builder.nativeHook;
        this.packageTampered = builder.packageTampered;
        this.root = builder.root;
        this.runMode = builder.runMode;
        this.soFileList = builder.soFileList;
        this.taskType = builder.taskType;
        this.tenantId = builder.tenantId;
        this.totalSwitch = builder.totalSwitch;
        this.useAShield = builder.useAShield;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartUserAppAsyncEnhanceInMsaRequest create() {
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
     * @return apkProtector
     */
    public Boolean getApkProtector() {
        return this.apkProtector;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return assetsFileList
     */
    public String getAssetsFileList() {
        return this.assetsFileList;
    }

    /**
     * @return classes
     */
    public String getClasses() {
        return this.classes;
    }

    /**
     * @return dalvikDebugger
     */
    public Integer getDalvikDebugger() {
        return this.dalvikDebugger;
    }

    /**
     * @return emulatorEnvironment
     */
    public Integer getEmulatorEnvironment() {
        return this.emulatorEnvironment;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return javaHook
     */
    public Integer getJavaHook() {
        return this.javaHook;
    }

    /**
     * @return memoryDump
     */
    public Integer getMemoryDump() {
        return this.memoryDump;
    }

    /**
     * @return nativeDebugger
     */
    public Integer getNativeDebugger() {
        return this.nativeDebugger;
    }

    /**
     * @return nativeHook
     */
    public Integer getNativeHook() {
        return this.nativeHook;
    }

    /**
     * @return packageTampered
     */
    public Integer getPackageTampered() {
        return this.packageTampered;
    }

    /**
     * @return root
     */
    public Integer getRoot() {
        return this.root;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return soFileList
     */
    public String getSoFileList() {
        return this.soFileList;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return totalSwitch
     */
    public Boolean getTotalSwitch() {
        return this.totalSwitch;
    }

    /**
     * @return useAShield
     */
    public Boolean getUseAShield() {
        return this.useAShield;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<StartUserAppAsyncEnhanceInMsaRequest, Builder> {
        private String regionId; 
        private Boolean apkProtector; 
        private String appId; 
        private String assetsFileList; 
        private String classes; 
        private Integer dalvikDebugger; 
        private Integer emulatorEnvironment; 
        private Long id; 
        private Integer javaHook; 
        private Integer memoryDump; 
        private Integer nativeDebugger; 
        private Integer nativeHook; 
        private Integer packageTampered; 
        private Integer root; 
        private String runMode; 
        private String soFileList; 
        private String taskType; 
        private String tenantId; 
        private Boolean totalSwitch; 
        private Boolean useAShield; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(StartUserAppAsyncEnhanceInMsaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apkProtector = request.apkProtector;
            this.appId = request.appId;
            this.assetsFileList = request.assetsFileList;
            this.classes = request.classes;
            this.dalvikDebugger = request.dalvikDebugger;
            this.emulatorEnvironment = request.emulatorEnvironment;
            this.id = request.id;
            this.javaHook = request.javaHook;
            this.memoryDump = request.memoryDump;
            this.nativeDebugger = request.nativeDebugger;
            this.nativeHook = request.nativeHook;
            this.packageTampered = request.packageTampered;
            this.root = request.root;
            this.runMode = request.runMode;
            this.soFileList = request.soFileList;
            this.taskType = request.taskType;
            this.tenantId = request.tenantId;
            this.totalSwitch = request.totalSwitch;
            this.useAShield = request.useAShield;
            this.workspaceId = request.workspaceId;
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
         * ApkProtector.
         */
        public Builder apkProtector(Boolean apkProtector) {
            this.putBodyParameter("ApkProtector", apkProtector);
            this.apkProtector = apkProtector;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AssetsFileList.
         */
        public Builder assetsFileList(String assetsFileList) {
            this.putBodyParameter("AssetsFileList", assetsFileList);
            this.assetsFileList = assetsFileList;
            return this;
        }

        /**
         * Classes.
         */
        public Builder classes(String classes) {
            this.putBodyParameter("Classes", classes);
            this.classes = classes;
            return this;
        }

        /**
         * DalvikDebugger.
         */
        public Builder dalvikDebugger(Integer dalvikDebugger) {
            this.putBodyParameter("DalvikDebugger", dalvikDebugger);
            this.dalvikDebugger = dalvikDebugger;
            return this;
        }

        /**
         * EmulatorEnvironment.
         */
        public Builder emulatorEnvironment(Integer emulatorEnvironment) {
            this.putBodyParameter("EmulatorEnvironment", emulatorEnvironment);
            this.emulatorEnvironment = emulatorEnvironment;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * JavaHook.
         */
        public Builder javaHook(Integer javaHook) {
            this.putBodyParameter("JavaHook", javaHook);
            this.javaHook = javaHook;
            return this;
        }

        /**
         * MemoryDump.
         */
        public Builder memoryDump(Integer memoryDump) {
            this.putBodyParameter("MemoryDump", memoryDump);
            this.memoryDump = memoryDump;
            return this;
        }

        /**
         * NativeDebugger.
         */
        public Builder nativeDebugger(Integer nativeDebugger) {
            this.putBodyParameter("NativeDebugger", nativeDebugger);
            this.nativeDebugger = nativeDebugger;
            return this;
        }

        /**
         * NativeHook.
         */
        public Builder nativeHook(Integer nativeHook) {
            this.putBodyParameter("NativeHook", nativeHook);
            this.nativeHook = nativeHook;
            return this;
        }

        /**
         * PackageTampered.
         */
        public Builder packageTampered(Integer packageTampered) {
            this.putBodyParameter("PackageTampered", packageTampered);
            this.packageTampered = packageTampered;
            return this;
        }

        /**
         * Root.
         */
        public Builder root(Integer root) {
            this.putBodyParameter("Root", root);
            this.root = root;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * SoFileList.
         */
        public Builder soFileList(String soFileList) {
            this.putBodyParameter("SoFileList", soFileList);
            this.soFileList = soFileList;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TotalSwitch.
         */
        public Builder totalSwitch(Boolean totalSwitch) {
            this.putBodyParameter("TotalSwitch", totalSwitch);
            this.totalSwitch = totalSwitch;
            return this;
        }

        /**
         * UseAShield.
         */
        public Builder useAShield(Boolean useAShield) {
            this.putBodyParameter("UseAShield", useAShield);
            this.useAShield = useAShield;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public StartUserAppAsyncEnhanceInMsaRequest build() {
            return new StartUserAppAsyncEnhanceInMsaRequest(this);
        } 

    } 

}

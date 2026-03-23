// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudwifi_pop20191118.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of AddApListToApgroup  AddApListToApgroupRequest
     * @return AddApListToApgroupResponse
     */
    CompletableFuture<AddApListToApgroupResponse> addApListToApgroup(AddApListToApgroupRequest request);

    /**
     * @param request the request parameters of DelApThirdApp  DelApThirdAppRequest
     * @return DelApThirdAppResponse
     */
    CompletableFuture<DelApThirdAppResponse> delApThirdApp(DelApThirdAppRequest request);

    /**
     * @param request the request parameters of DeleteApSsidConfig  DeleteApSsidConfigRequest
     * @return DeleteApSsidConfigResponse
     */
    CompletableFuture<DeleteApSsidConfigResponse> deleteApSsidConfig(DeleteApSsidConfigRequest request);

    /**
     * @param request the request parameters of DeleteApgroupConfig  DeleteApgroupConfigRequest
     * @return DeleteApgroupConfigResponse
     */
    CompletableFuture<DeleteApgroupConfigResponse> deleteApgroupConfig(DeleteApgroupConfigRequest request);

    /**
     * @param request the request parameters of DeleteApgroupSsidConfig  DeleteApgroupSsidConfigRequest
     * @return DeleteApgroupSsidConfigResponse
     */
    CompletableFuture<DeleteApgroupSsidConfigResponse> deleteApgroupSsidConfig(DeleteApgroupSsidConfigRequest request);

    /**
     * @param request the request parameters of DeleteApgroupThirdApp  DeleteApgroupThirdAppRequest
     * @return DeleteApgroupThirdAppResponse
     */
    CompletableFuture<DeleteApgroupThirdAppResponse> deleteApgroupThirdApp(DeleteApgroupThirdAppRequest request);

    /**
     * @param request the request parameters of DeleteNetDeviceInfo  DeleteNetDeviceInfoRequest
     * @return DeleteNetDeviceInfoResponse
     */
    CompletableFuture<DeleteNetDeviceInfoResponse> deleteNetDeviceInfo(DeleteNetDeviceInfoRequest request);

    /**
     * @param request the request parameters of EditApgroupThirdApp  EditApgroupThirdAppRequest
     * @return EditApgroupThirdAppResponse
     */
    CompletableFuture<EditApgroupThirdAppResponse> editApgroupThirdApp(EditApgroupThirdAppRequest request);

    /**
     * @param request the request parameters of EffectApConfig  EffectApConfigRequest
     * @return EffectApConfigResponse
     */
    CompletableFuture<EffectApConfigResponse> effectApConfig(EffectApConfigRequest request);

    /**
     * @param request the request parameters of EffectApgroupConfig  EffectApgroupConfigRequest
     * @return EffectApgroupConfigResponse
     */
    CompletableFuture<EffectApgroupConfigResponse> effectApgroupConfig(EffectApgroupConfigRequest request);

    /**
     * @param request the request parameters of GetAntStaStatusByMac  GetAntStaStatusByMacRequest
     * @return GetAntStaStatusByMacResponse
     */
    CompletableFuture<GetAntStaStatusByMacResponse> getAntStaStatusByMac(GetAntStaStatusByMacRequest request);

    /**
     * @param request the request parameters of GetApAddressByMac  GetApAddressByMacRequest
     * @return GetApAddressByMacResponse
     */
    CompletableFuture<GetApAddressByMacResponse> getApAddressByMac(GetApAddressByMacRequest request);

    /**
     * @param request the request parameters of GetApAsset  GetApAssetRequest
     * @return GetApAssetResponse
     */
    CompletableFuture<GetApAssetResponse> getApAsset(GetApAssetRequest request);

    /**
     * @param request the request parameters of GetApDetailStatus  GetApDetailStatusRequest
     * @return GetApDetailStatusResponse
     */
    CompletableFuture<GetApDetailStatusResponse> getApDetailStatus(GetApDetailStatusRequest request);

    /**
     * @param request the request parameters of GetApDetailedConfig  GetApDetailedConfigRequest
     * @return GetApDetailedConfigResponse
     */
    CompletableFuture<GetApDetailedConfigResponse> getApDetailedConfig(GetApDetailedConfigRequest request);

    /**
     * @param request the request parameters of GetApInfoFromPool  GetApInfoFromPoolRequest
     * @return GetApInfoFromPoolResponse
     */
    CompletableFuture<GetApInfoFromPoolResponse> getApInfoFromPool(GetApInfoFromPoolRequest request);

    /**
     * @param request the request parameters of GetApRunHistoryTimeSer  GetApRunHistoryTimeSerRequest
     * @return GetApRunHistoryTimeSerResponse
     */
    CompletableFuture<GetApRunHistoryTimeSerResponse> getApRunHistoryTimeSer(GetApRunHistoryTimeSerRequest request);

    /**
     * @param request the request parameters of GetApStatusByGroupId  GetApStatusByGroupIdRequest
     * @return GetApStatusByGroupIdResponse
     */
    CompletableFuture<GetApStatusByGroupIdResponse> getApStatusByGroupId(GetApStatusByGroupIdRequest request);

    /**
     * @param request the request parameters of GetApgroupConfigByIdentity  GetApgroupConfigByIdentityRequest
     * @return GetApgroupConfigByIdentityResponse
     */
    CompletableFuture<GetApgroupConfigByIdentityResponse> getApgroupConfigByIdentity(GetApgroupConfigByIdentityRequest request);

    /**
     * @param request the request parameters of GetApgroupDetailedConfig  GetApgroupDetailedConfigRequest
     * @return GetApgroupDetailedConfigResponse
     */
    CompletableFuture<GetApgroupDetailedConfigResponse> getApgroupDetailedConfig(GetApgroupDetailedConfigRequest request);

    /**
     * @param request the request parameters of GetApgroupId  GetApgroupIdRequest
     * @return GetApgroupIdResponse
     */
    CompletableFuture<GetApgroupIdResponse> getApgroupId(GetApgroupIdRequest request);

    /**
     * @param request the request parameters of GetApgroupSsidConfig  GetApgroupSsidConfigRequest
     * @return GetApgroupSsidConfigResponse
     */
    CompletableFuture<GetApgroupSsidConfigResponse> getApgroupSsidConfig(GetApgroupSsidConfigRequest request);

    /**
     * @param request the request parameters of GetBatchTaskProgress  GetBatchTaskProgressRequest
     * @return GetBatchTaskProgressResponse
     */
    CompletableFuture<GetBatchTaskProgressResponse> getBatchTaskProgress(GetBatchTaskProgressRequest request);

    /**
     * @param request the request parameters of GetGroupMiscAggTimeSer  GetGroupMiscAggTimeSerRequest
     * @return GetGroupMiscAggTimeSerResponse
     */
    CompletableFuture<GetGroupMiscAggTimeSerResponse> getGroupMiscAggTimeSer(GetGroupMiscAggTimeSerRequest request);

    /**
     * @param request the request parameters of GetNetDeviceInfo  GetNetDeviceInfoRequest
     * @return GetNetDeviceInfoResponse
     */
    CompletableFuture<GetNetDeviceInfoResponse> getNetDeviceInfo(GetNetDeviceInfoRequest request);

    /**
     * @param request the request parameters of GetNetDeviceInfoWithSize  GetNetDeviceInfoWithSizeRequest
     * @return GetNetDeviceInfoWithSizeResponse
     */
    CompletableFuture<GetNetDeviceInfoWithSizeResponse> getNetDeviceInfoWithSize(GetNetDeviceInfoWithSizeRequest request);

    /**
     * @param request the request parameters of GetPageVisitData  GetPageVisitDataRequest
     * @return GetPageVisitDataResponse
     */
    CompletableFuture<GetPageVisitDataResponse> getPageVisitData(GetPageVisitDataRequest request);

    /**
     * @param request the request parameters of GetRadioRunHistoryTimeSer  GetRadioRunHistoryTimeSerRequest
     * @return GetRadioRunHistoryTimeSerResponse
     */
    CompletableFuture<GetRadioRunHistoryTimeSerResponse> getRadioRunHistoryTimeSer(GetRadioRunHistoryTimeSerRequest request);

    /**
     * @param request the request parameters of GetStaDetailedStatusByMac  GetStaDetailedStatusByMacRequest
     * @return GetStaDetailedStatusByMacResponse
     */
    CompletableFuture<GetStaDetailedStatusByMacResponse> getStaDetailedStatusByMac(GetStaDetailedStatusByMacRequest request);

    /**
     * @param request the request parameters of GetStaStatusListByAp  GetStaStatusListByApRequest
     * @return GetStaStatusListByApResponse
     */
    CompletableFuture<GetStaStatusListByApResponse> getStaStatusListByAp(GetStaStatusListByApRequest request);

    /**
     * @param request the request parameters of JudgeXingTianBusiness  JudgeXingTianBusinessRequest
     * @return JudgeXingTianBusinessResponse
     */
    CompletableFuture<JudgeXingTianBusinessResponse> judgeXingTianBusiness(JudgeXingTianBusinessRequest request);

    /**
     * @param request the request parameters of KickAntSta  KickAntStaRequest
     * @return KickAntStaResponse
     */
    CompletableFuture<KickAntStaResponse> kickAntSta(KickAntStaRequest request);

    /**
     * @param request the request parameters of KickSta  KickStaRequest
     * @return KickStaResponse
     */
    CompletableFuture<KickStaResponse> kickSta(KickStaRequest request);

    /**
     * @param request the request parameters of ListApgroupDescendant  ListApgroupDescendantRequest
     * @return ListApgroupDescendantResponse
     */
    CompletableFuture<ListApgroupDescendantResponse> listApgroupDescendant(ListApgroupDescendantRequest request);

    /**
     * @param request the request parameters of ListJobOrders  ListJobOrdersRequest
     * @return ListJobOrdersResponse
     */
    CompletableFuture<ListJobOrdersResponse> listJobOrders(ListJobOrdersRequest request);

    /**
     * @param request the request parameters of ListJobOrdersWithSize  ListJobOrdersWithSizeRequest
     * @return ListJobOrdersWithSizeResponse
     */
    CompletableFuture<ListJobOrdersWithSizeResponse> listJobOrdersWithSize(ListJobOrdersWithSizeRequest request);

    /**
     * @param request the request parameters of NewApgroupConfig  NewApgroupConfigRequest
     * @return NewApgroupConfigResponse
     */
    CompletableFuture<NewApgroupConfigResponse> newApgroupConfig(NewApgroupConfigRequest request);

    /**
     * @param request the request parameters of NewJobOrder  NewJobOrderRequest
     * @return NewJobOrderResponse
     */
    CompletableFuture<NewJobOrderResponse> newJobOrder(NewJobOrderRequest request);

    /**
     * @param request the request parameters of NewNetDeviceInfo  NewNetDeviceInfoRequest
     * @return NewNetDeviceInfoResponse
     */
    CompletableFuture<NewNetDeviceInfoResponse> newNetDeviceInfo(NewNetDeviceInfoRequest request);

    /**
     * @param request the request parameters of PutAppConfigAndSave  PutAppConfigAndSaveRequest
     * @return PutAppConfigAndSaveResponse
     */
    CompletableFuture<PutAppConfigAndSaveResponse> putAppConfigAndSave(PutAppConfigAndSaveRequest request);

    /**
     * @param request the request parameters of QueryJobOrder  QueryJobOrderRequest
     * @return QueryJobOrderResponse
     */
    CompletableFuture<QueryJobOrderResponse> queryJobOrder(QueryJobOrderRequest request);

    /**
     * @param request the request parameters of RebootAp  RebootApRequest
     * @return RebootApResponse
     */
    CompletableFuture<RebootApResponse> rebootAp(RebootApRequest request);

    /**
     * @param request the request parameters of RegisterApAsset  RegisterApAssetRequest
     * @return RegisterApAssetResponse
     */
    CompletableFuture<RegisterApAssetResponse> registerApAsset(RegisterApAssetRequest request);

    /**
     * @param request the request parameters of RepairApRadio  RepairApRadioRequest
     * @return RepairApRadioResponse
     */
    CompletableFuture<RepairApRadioResponse> repairApRadio(RepairApRadioRequest request);

    /**
     * @param request the request parameters of SaveApBasicConfig  SaveApBasicConfigRequest
     * @return SaveApBasicConfigResponse
     */
    CompletableFuture<SaveApBasicConfigResponse> saveApBasicConfig(SaveApBasicConfigRequest request);

    /**
     * @param request the request parameters of SaveApPortalConfig  SaveApPortalConfigRequest
     * @return SaveApPortalConfigResponse
     */
    CompletableFuture<SaveApPortalConfigResponse> saveApPortalConfig(SaveApPortalConfigRequest request);

    /**
     * @param request the request parameters of SaveApRadioConfig  SaveApRadioConfigRequest
     * @return SaveApRadioConfigResponse
     */
    CompletableFuture<SaveApRadioConfigResponse> saveApRadioConfig(SaveApRadioConfigRequest request);

    /**
     * @param request the request parameters of SaveApSsidConfig  SaveApSsidConfigRequest
     * @return SaveApSsidConfigResponse
     */
    CompletableFuture<SaveApSsidConfigResponse> saveApSsidConfig(SaveApSsidConfigRequest request);

    /**
     * @param request the request parameters of SaveApThirdApp  SaveApThirdAppRequest
     * @return SaveApThirdAppResponse
     */
    CompletableFuture<SaveApThirdAppResponse> saveApThirdApp(SaveApThirdAppRequest request);

    /**
     * @param request the request parameters of SaveApgroupBasicConfig  SaveApgroupBasicConfigRequest
     * @return SaveApgroupBasicConfigResponse
     */
    CompletableFuture<SaveApgroupBasicConfigResponse> saveApgroupBasicConfig(SaveApgroupBasicConfigRequest request);

    /**
     * @param request the request parameters of SaveApgroupPortalConfig  SaveApgroupPortalConfigRequest
     * @return SaveApgroupPortalConfigResponse
     */
    CompletableFuture<SaveApgroupPortalConfigResponse> saveApgroupPortalConfig(SaveApgroupPortalConfigRequest request);

    /**
     * @param request the request parameters of SaveApgroupSsidConfig  SaveApgroupSsidConfigRequest
     * @return SaveApgroupSsidConfigResponse
     */
    CompletableFuture<SaveApgroupSsidConfigResponse> saveApgroupSsidConfig(SaveApgroupSsidConfigRequest request);

    /**
     * @param request the request parameters of SetApAddress  SetApAddressRequest
     * @return SetApAddressResponse
     */
    CompletableFuture<SetApAddressResponse> setApAddress(SetApAddressRequest request);

    /**
     * @param request the request parameters of SetApName  SetApNameRequest
     * @return SetApNameResponse
     */
    CompletableFuture<SetApNameResponse> setApName(SetApNameRequest request);

    /**
     * @param request the request parameters of UnRegisterApAsset  UnRegisterApAssetRequest
     * @return UnRegisterApAssetResponse
     */
    CompletableFuture<UnRegisterApAssetResponse> unRegisterApAsset(UnRegisterApAssetRequest request);

    /**
     * @param request the request parameters of UpdateNetDeviceInfo  UpdateNetDeviceInfoRequest
     * @return UpdateNetDeviceInfoResponse
     */
    CompletableFuture<UpdateNetDeviceInfoResponse> updateNetDeviceInfo(UpdateNetDeviceInfoRequest request);

}

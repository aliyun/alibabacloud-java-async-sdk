// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sddp20260120.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Sddp";
        this.version = "2026-01-20";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hongkong", "sddp-api.cn-hongkong.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>创建列加密前检查实例的权限、引擎及运行条件。应同时检查响应中的 ErrorCode 和 ErrorMessage；仅 ErrorCode=Success 表示检查通过，请求成功本身不表示实例满足全部加密条件。此检查不会创建列加密规则。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of CheckDataMaskingInstance  CheckDataMaskingInstanceRequest
     * @return CheckDataMaskingInstanceResponse
     */
    @Override
    public CompletableFuture<CheckDataMaskingInstanceResponse> checkDataMaskingInstance(CheckDataMaskingInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDataMaskingInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDataMaskingInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDataMaskingInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>为同一实例下指定数据库、表和列创建列加密规则。调用前检查实例状态、支持算法、密钥、目标列和账号。SubRuleList 为按表分组的目标列表，Columns 是以英文逗号分隔的列名字符串；UserList 中的账号被授予 fullAccess 明文权限。请求成功仅表示已受理，必须回读 ListDataMaskingColumns 和 ListDataAssetAccounts 确认列状态、账号权限及期限。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。
     * 本接口仅返回 RequestId。请求受理不等于业务操作完成，应按接口说明回读状态。</p>
     * 
     * @param request the request parameters of CreateDataMaskingRule  CreateDataMaskingRuleRequest
     * @return CreateDataMaskingRuleResponse
     */
    @Override
    public CompletableFuture<CreateDataMaskingRuleResponse> createDataMaskingRule(CreateDataMaskingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataMaskingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataMaskingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataMaskingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataMaskingRule  DeleteDataMaskingRuleRequest
     * @return DeleteDataMaskingRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDataMaskingRuleResponse> deleteDataMaskingRule(DeleteDataMaskingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataMaskingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataMaskingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataMaskingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按产品范围查询当前地域数据库账号的权限统计。明文账号对应 FullAccessCount；限制访问和禁止解密账号分别计入 RestrictedAccessCount、NoneAccessCount。未配置权限账号数可由 TotalCount 减去上述三类账号数得到。本接口不接受实例、库、表、列等筛选条件。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of GetDataMaskingAccountCount  GetDataMaskingAccountCountRequest
     * @return GetDataMaskingAccountCountResponse
     */
    @Override
    public CompletableFuture<GetDataMaskingAccountCountResponse> getDataMaskingAccountCount(GetDataMaskingAccountCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataMaskingAccountCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataMaskingAccountCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataMaskingAccountCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按地域、产品和分类分级模板查询总列数、敏感列数、已加密列数和加密失败列数。本接口返回统计卡片数据，不跟随列列表中的实例、库名、表名、列名或模型筛选。
     * 为兼容历史识别结果，指定模板无首屏结果且未按敏感等级或识别模型过滤时，结果可能回退到内置通用识别结果。要求严格模板归属时，请同时使用该模板内的等级或模型条件核验。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of GetDataMaskingColumnCount  GetDataMaskingColumnCountRequest
     * @return GetDataMaskingColumnCountResponse
     */
    @Override
    public CompletableFuture<GetDataMaskingColumnCountResponse> getDataMaskingColumnCount(GetDataMaskingColumnCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataMaskingColumnCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataMaskingColumnCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataMaskingColumnCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceAttribute  GetInstanceAttributeRequest
     * @return GetInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<GetInstanceAttributeResponse> getInstanceAttribute(GetInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    @Override
    public CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListColumns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataAssetAccounts  ListDataAssetAccountsRequest
     * @return ListDataAssetAccountsResponse
     */
    @Override
    public CompletableFuture<ListDataAssetAccountsResponse> listDataAssetAccounts(ListDataAssetAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataAssetAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataAssetAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataAssetAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>分页查询列及其加密状态、敏感等级和识别模型。支持模板、产品、实例、数据库、表、列名、模型和敏感等级组合筛选。创建或关闭规则后使用本接口回读；Processing、Deleting 为中间状态，Failed、DeleteFailed 表示操作失败。RiskLeveLId 的参数名大小写应原样保留。
     * 按产品查询时使用单个 ProductId 或对应 ProductCode。当前列查询不能依赖 ProductIds 实现多产品筛选；多产品应分别查询。
     * 为兼容历史识别结果，指定模板无首屏结果且未按敏感等级或识别模型过滤时，结果可能回退到内置通用识别结果。要求严格模板归属时，请同时使用该模板内的等级或模型条件核验。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListDataMaskingColumns  ListDataMaskingColumnsRequest
     * @return ListDataMaskingColumnsResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingColumnsResponse> listDataMaskingColumns(ListDataMaskingColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingColumns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询指定实例可选的列加密算法及各算法的限制原因。选择算法前检查对应项的 ErrorCode 和 ErrorMessage；不要把所有实例都视为支持同一组算法。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListDataMaskingEncryptionAlgorithms  ListDataMaskingEncryptionAlgorithmsRequest
     * @return ListDataMaskingEncryptionAlgorithmsResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingEncryptionAlgorithmsResponse> listDataMaskingEncryptionAlgorithms(ListDataMaskingEncryptionAlgorithmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingEncryptionAlgorithms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingEncryptionAlgorithmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingEncryptionAlgorithmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>分页查询列加密实例，并支持产品、识别模板及库表列等条件。实例级状态筛选与列级状态筛选范围不同：查找全部未加密敏感列时，先枚举目标产品的实例，再使用 ListDataMaskingColumns 按 NotEncrypted 筛选，避免遗漏已经部分加密的实例。
     * 需要按 EngineType 精确筛选时，应完整分页读取候选后按返回值过滤；部分查询路径不应用此参数。InstanceId 的匹配语义随查询组合变化，精确定位时应核对返回的完整实例标识。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListDataMaskingInstances  ListDataMaskingInstancesRequest
     * @return ListDataMaskingInstancesResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingInstancesResponse> listDataMaskingInstances(ListDataMaskingInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>分页查询已纳管的数据源。关系型数据库场景通过 ProductCode、InstanceId 定位实例，从 Items[].DbName 选择数据库。本接口查询数据库库存，不使用分类分级模板筛选。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询指定模板内有效的识别模型，返回 RuleList。未指定 TemplateId 时使用当前启用模板。模型标识取 RuleList[].Id，可用于 TemplateRuleIds 筛选。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。</p>
     * 
     * @param request the request parameters of ListIdentifyModels  ListIdentifyModelsRequest
     * @return ListIdentifyModelsResponse
     */
    @Override
    public CompletableFuture<ListIdentifyModelsResponse> listIdentifyModels(ListIdentifyModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIdentifyModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentifyModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentifyModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKmsKeys  ListKmsKeysRequest
     * @return ListKmsKeysResponse
     */
    @Override
    public CompletableFuture<ListKmsKeysResponse> listKmsKeys(ListKmsKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKmsKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKmsKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKmsKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询实例可选择的内核版本。升级时从 KernelVersions[].KernelVersion 选择目标，不应手工构造版本号。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListMiniEngineVersions  ListMiniEngineVersionsRequest
     * @return ListMiniEngineVersionsResponse
     */
    @Override
    public CompletableFuture<ListMiniEngineVersionsResponse> listMiniEngineVersions(ListMiniEngineVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMiniEngineVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMiniEngineVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMiniEngineVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询当前账号拥有资产的地域列表，用于选择后续地域化接口的 RegionId。可按是否开启审计、是否开启识别筛选。返回的地域列表不等同于所有云产品支持地域清单。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRiskLevels  ListRiskLevelsRequest
     * @return ListRiskLevelsResponse
     */
    @Override
    public CompletableFuture<ListRiskLevelsResponse> listRiskLevels(ListRiskLevelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRiskLevels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRiskLevelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRiskLevelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>分页查询数据库中的数据表及识别结果。关系型数据库场景传入 DataAssetSourceId=实例标识、DataSourceName=数据库名称。PostgreSQL 和 Oracle 的表名可能包含 schema 前缀，后续列查询应原样传递表名。
     * 为兼容历史识别结果，指定模板无首屏结果且未按敏感等级或识别模型过滤时，结果可能回退到内置通用识别结果。要求严格模板归属时，请同时使用该模板内的等级或模型条件核验。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。</p>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询总览、数据目录或按地域汇总的敏感数据统计。CountType=41 返回总览统计，42 返回指定产品的数据目录统计，43 返回按地域和模板聚合的数据。列加密控制台使用 CountType=43 与 ProductCodeList 获取地域和模板候选。统计数据可能来自已生成的汇总结果，不代表刚发起的同步或加密操作已经完成。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。</p>
     * 
     * @param request the request parameters of ListTotalSensitiveInfo  ListTotalSensitiveInfoRequest
     * @return ListTotalSensitiveInfoResponse
     */
    @Override
    public CompletableFuture<ListTotalSensitiveInfoResponse> listTotalSensitiveInfo(ListTotalSensitiveInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTotalSensitiveInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTotalSensitiveInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTotalSensitiveInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>触发当前地域内指定产品的资产同步，作用范围是产品和地域，不限于某个实例。请求成功仅表示已受理；随后通过实例、数据库、表和列列表核对资产变化。该接口不返回可供轮询的公开任务标识。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。
     * 本接口仅返回 RequestId。请求受理不等于业务操作完成，应按接口说明回读状态。</p>
     * 
     * @param request the request parameters of SyncDataAssets  SyncDataAssetsRequest
     * @return SyncDataAssetsResponse
     */
    @Override
    public CompletableFuture<SyncDataAssetsResponse> syncDataAssets(SyncDataAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncDataAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDataAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDataAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>修改实例级列加密算法及密钥配置，影响该实例的列加密配置。当前实现支持 RDS MySQL 和 PolarDB-X 2.0；先查询实例支持算法和密钥。该接口没有 EncryptionKeyMode 参数，应按 EncryptionKeyId 的使用条件配置。请求成功后回读实例加密配置和列状态，不能仅凭 RequestId 判断完成。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。
     * 本接口仅返回 RequestId。请求受理不等于业务操作完成，应按接口说明回读状态。</p>
     * 
     * @param request the request parameters of UpdateDataMaskingEncryptionAlgorithm  UpdateDataMaskingEncryptionAlgorithmRequest
     * @return UpdateDataMaskingEncryptionAlgorithmResponse
     */
    @Override
    public CompletableFuture<UpdateDataMaskingEncryptionAlgorithmResponse> updateDataMaskingEncryptionAlgorithm(UpdateDataMaskingEncryptionAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataMaskingEncryptionAlgorithm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataMaskingEncryptionAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataMaskingEncryptionAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>为一批数据库账号设置同一种列加密访问权限。UserList 可包含同一产品、同一地域下不同实例的账号，每项必须携带 InstanceId 和 AccountId。fullAccess 允许明文访问，restrictedAccess 允许受限访问，noneAccess 禁止解密且仅支持特定引擎和密钥模式。仅 fullAccess 可配置有效期。请求成功后使用 ListDataAssetAccounts 回读。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。
     * 本接口仅返回 RequestId。请求受理不等于业务操作完成，应按接口说明回读状态。</p>
     * 
     * @param request the request parameters of UpdateDataMaskingUsers  UpdateDataMaskingUsersRequest
     * @return UpdateDataMaskingUsersResponse
     */
    @Override
    public CompletableFuture<UpdateDataMaskingUsersResponse> updateDataMaskingUsers(UpdateDataMaskingUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataMaskingUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataMaskingUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataMaskingUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按所选时间升级指定实例的数据库内核。先调用 ListMiniEngineVersions 选择版本，并检查实例当前状态和维护窗口。SpecifyTime 需要提供未来的 SwitchTime，PolarDB-X 2.0 不支持该时间选项。升级为异步操作，回读 GetInstanceAttribute 的 CurrentKernelVersion 核对结果。
     * 参数示例仅用于说明格式。调用时请替换为当前账号查询得到的地域、资源标识和配置值。
     * 使用目标资产所在地域的服务接入点，并设置公共参数 RegionId，例如 cn-zhangjiakou。产品编码和实例标识必须与目标资产一致。
     * 本接口仅返回 RequestId。请求受理不等于业务操作完成，应按接口说明回读状态。</p>
     * 
     * @param request the request parameters of UpgradeKernelVersion  UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeKernelVersionResponse> upgradeKernelVersion(UpgradeKernelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeKernelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeKernelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeKernelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}

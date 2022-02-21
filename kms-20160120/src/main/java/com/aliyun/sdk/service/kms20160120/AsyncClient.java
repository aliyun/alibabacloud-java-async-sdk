// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.kms20160120.models.*;
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

    CompletableFuture<AsymmetricDecryptResponse> asymmetricDecrypt(AsymmetricDecryptRequest request);

    CompletableFuture<AsymmetricEncryptResponse> asymmetricEncrypt(AsymmetricEncryptRequest request);

    CompletableFuture<AsymmetricSignResponse> asymmetricSign(AsymmetricSignRequest request);

    CompletableFuture<AsymmetricVerifyResponse> asymmetricVerify(AsymmetricVerifyRequest request);

    CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletion(CancelKeyDeletionRequest request);

    CompletableFuture<CertificatePrivateKeyDecryptResponse> certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request);

    CompletableFuture<CertificatePrivateKeySignResponse> certificatePrivateKeySign(CertificatePrivateKeySignRequest request);

    CompletableFuture<CertificatePublicKeyEncryptResponse> certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request);

    CompletableFuture<CertificatePublicKeyVerifyResponse> certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request);

    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    CompletableFuture<CreateCertificateResponse> createCertificate(CreateCertificateRequest request);

    CompletableFuture<CreateKeyResponse> createKey(CreateKeyRequest request);

    CompletableFuture<CreateKeyVersionResponse> createKeyVersion(CreateKeyVersionRequest request);

    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    CompletableFuture<DecryptResponse> decrypt(DecryptRequest request);

    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    CompletableFuture<DeleteKeyMaterialResponse> deleteKeyMaterial(DeleteKeyMaterialRequest request);

    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    CompletableFuture<DescribeAccountKmsStatusResponse> describeAccountKmsStatus(DescribeAccountKmsStatusRequest request);

    CompletableFuture<DescribeCertificateResponse> describeCertificate(DescribeCertificateRequest request);

    CompletableFuture<DescribeKeyResponse> describeKey(DescribeKeyRequest request);

    CompletableFuture<DescribeKeyVersionResponse> describeKeyVersion(DescribeKeyVersionRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request);

    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    CompletableFuture<DisableKeyResponse> disableKey(DisableKeyRequest request);

    CompletableFuture<EnableKeyResponse> enableKey(EnableKeyRequest request);

    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    CompletableFuture<ExportCertificateResponse> exportCertificate(ExportCertificateRequest request);

    CompletableFuture<ExportDataKeyResponse> exportDataKey(ExportDataKeyRequest request);

    CompletableFuture<GenerateAndExportDataKeyResponse> generateAndExportDataKey(GenerateAndExportDataKeyRequest request);

    CompletableFuture<GenerateDataKeyResponse> generateDataKey(GenerateDataKeyRequest request);

    CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request);

    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    CompletableFuture<GetParametersForImportResponse> getParametersForImport(GetParametersForImportRequest request);

    CompletableFuture<GetPublicKeyResponse> getPublicKey(GetPublicKeyRequest request);

    CompletableFuture<GetRandomPasswordResponse> getRandomPassword(GetRandomPasswordRequest request);

    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    CompletableFuture<ImportCertificateResponse> importCertificate(ImportCertificateRequest request);

    CompletableFuture<ImportEncryptionCertificateResponse> importEncryptionCertificate(ImportEncryptionCertificateRequest request);

    CompletableFuture<ImportKeyMaterialResponse> importKeyMaterial(ImportKeyMaterialRequest request);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListAliasesByKeyIdResponse> listAliasesByKeyId(ListAliasesByKeyIdRequest request);

    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

    CompletableFuture<ListKeyVersionsResponse> listKeyVersions(ListKeyVersionsRequest request);

    CompletableFuture<ListKeysResponse> listKeys(ListKeysRequest request);

    CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request);

    CompletableFuture<ListSecretVersionIdsResponse> listSecretVersionIds(ListSecretVersionIdsRequest request);

    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    CompletableFuture<OpenKmsServiceResponse> openKmsService(OpenKmsServiceRequest request);

    CompletableFuture<PutSecretValueResponse> putSecretValue(PutSecretValueRequest request);

    CompletableFuture<ReEncryptResponse> reEncrypt(ReEncryptRequest request);

    CompletableFuture<RestoreSecretResponse> restoreSecret(RestoreSecretRequest request);

    CompletableFuture<RotateSecretResponse> rotateSecret(RotateSecretRequest request);

    CompletableFuture<ScheduleKeyDeletionResponse> scheduleKeyDeletion(ScheduleKeyDeletionRequest request);

    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateCertificateStatusResponse> updateCertificateStatus(UpdateCertificateStatusRequest request);

    CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescription(UpdateKeyDescriptionRequest request);

    CompletableFuture<UpdateRotationPolicyResponse> updateRotationPolicy(UpdateRotationPolicyRequest request);

    CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request);

    CompletableFuture<UpdateSecretRotationPolicyResponse> updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request);

    CompletableFuture<UpdateSecretVersionStageResponse> updateSecretVersionStage(UpdateSecretVersionStageRequest request);

    CompletableFuture<UploadCertificateResponse> uploadCertificate(UploadCertificateRequest request);

}
